package com.bank.customerservice.service;

import java.security.Key;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JWTService {

	@Value("${jwt.secretkey}")
	public String jwtKey;
	
	public String getJWTKey(String userName,String roles) {
		
		return Jwts.builder().
				setIssuer("Customer Service")
				.claim("userName", userName)
				.claim("roles", roles)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
				.signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
		
	}
	
	public Claims getClaims(String token) {
		
         Claims claims = Jwts.parserBuilder()
                 .setSigningKey(getSignKey())
                 .build()
                 .parseClaimsJws(token)
                 .getBody();
         return claims;
		
	}
	
	 private Key getSignKey() {
	        byte[] keyBytes= Decoders.BASE64.decode(jwtKey);
	        return Keys.hmacShaKeyFor(keyBytes);
	    }
}
