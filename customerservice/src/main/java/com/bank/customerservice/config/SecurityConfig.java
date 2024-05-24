package com.bank.customerservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.bank.customerservice.filter.CustomerAuthFilter;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@Configuration
@SecurityScheme(
        name = "Authorization",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class SecurityConfig {
	
	@Autowired
	CustomerAuthFilter cstmFilter;

	@Bean
	public SecurityFilterChain configSecurity(HttpSecurity http) throws Exception {

		http.headers().frameOptions().disable().and().cors().disable().csrf().disable()
				.authorizeHttpRequests(
						req -> req
								.requestMatchers("/h2-console/**", "/v3/api-docs/**", "/swagger-ui/**",
										"/customers/create", "/customers/login")
								.permitAll().anyRequest().authenticated())
				.formLogin().disable();
		http.addFilterAfter(cstmFilter, UsernamePasswordAuthenticationFilter.class);
		return http.build();

	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {

		return new BCryptPasswordEncoder();

	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
}
