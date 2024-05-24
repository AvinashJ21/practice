package com.bank.customerservice.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.bank.customerservice.entities.Customer;
import com.bank.customerservice.repository.CustomerRepository;
import com.bank.customerservice.service.JWTService;

import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomerAuthFilter extends OncePerRequestFilter {

	@Autowired
	CustomerRepository cstmrRepo;

	@Autowired
	JWTService jwtService;

	Logger log = LoggerFactory.getLogger(CustomerAuthFilter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		log.info("URL {}  URI {} ENDS WITH {}", request.getRequestURI(), request.getRequestURL(),
				request.getRequestURI().endsWith("/create"));
		if (!request.getRequestURI().endsWith("/login") && !request.getRequestURI().endsWith("/create") && !request.getRequestURI().contains("/h2-console")) {

			String authHeader = request.getHeader("Authorization");
			String token = null;
			String username = null;

			if (authHeader != null && authHeader.startsWith("Bearer ")) {
				token = authHeader.substring(7);
				Claims c = jwtService.getClaims(token);
				log.info("USER NAME {}", c.get("userName").toString());
				if (SecurityContextHolder.getContext().getAuthentication() == null) {
					Optional<Customer> byUserName = cstmrRepo.findByUserName(c.get("userName").toString());
					if (byUserName.isPresent() && !c.getExpiration().before(new Date())) {
						SecurityContextHolder.getContext()
								.setAuthentication(new UsernamePasswordAuthenticationToken(
										byUserName.get().getUserName(), byUserName.get().getPassword(),
										getAuthorities(byUserName.get().getRoles())));
					} else {
						throw new BadCredentialsException("Invalid User");
					}
				}
			} else {
				throw new RuntimeException("No Authorization key found");
			}

		}

		filterChain.doFilter(request, response);

	}

	private List<GrantedAuthority> getAuthorities(String roles) {

		List<GrantedAuthority> authList = new ArrayList<>();
		if (roles != null && !roles.isEmpty()) {
			List<String> roleList = Arrays.asList(roles.split(","));

			for (String str : roleList) {
				authList.add(new SimpleGrantedAuthority(str));
			}
		}
		return authList;
	}

}
