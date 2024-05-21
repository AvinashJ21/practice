package com.bank.customerservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	
	@Bean
	public SecurityFilterChain configSecurity(HttpSecurity http) throws Exception {
		
	
		http.headers().frameOptions().disable().and().cors().disable()
	    .csrf().disable()
		.authorizeHttpRequests(req->req.requestMatchers("/h2-console/**","/v3/api-docs/**","/swagger-ui/**","/customers/create","/customers/login").permitAll()
		.anyRequest().authenticated())
		.formLogin().disable();
		return http.build();
	
	}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
		
	}
}

