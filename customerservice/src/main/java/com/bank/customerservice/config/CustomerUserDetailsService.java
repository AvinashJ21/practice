package com.bank.customerservice.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.bank.customerservice.entities.Customer;
import com.bank.customerservice.repository.CustomerRepository;

@Component
public class CustomerUserDetailsService implements AuthenticationProvider {

	@Autowired
	CustomerRepository cstmrRepo;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	private List<GrantedAuthority> getAuthorities(String roles){
		
		List<GrantedAuthority> authList = new ArrayList<>();
		if(roles !=null && !roles.isEmpty()) {
		List<String> roleList = Arrays.asList(roles.split(","));
		
		for(String str:roleList) {
			authList.add(new SimpleGrantedAuthority(str));
		}
		}
		return authList;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		Optional<Customer> cstmrOpt = cstmrRepo.findByUserName(authentication.getName());
		if(cstmrOpt.isPresent() && passwordEncoder.matches(authentication.getCredentials().toString(), cstmrOpt.get().getPassword())) {
			Customer cstmr = cstmrOpt.get();
			return new UsernamePasswordAuthenticationToken(cstmr.getUserName(),null,getAuthorities(cstmr.getRoles()));
		}
		else {
		  throw new BadCredentialsException("Invalid User");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

}
