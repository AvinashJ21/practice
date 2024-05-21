package com.bank.customerservice.dto;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public class CustomerDetailsDTO {

	private String userName;
	private String password;
	private String authorizationKey;
	private List<? extends GrantedAuthority> roles;

	public CustomerDetailsDTO(String name, String pwd, String key, List<? extends GrantedAuthority> collection) {
		userName = name;
		this.password = pwd;
		authorizationKey = key;
		this.roles = collection;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthorizationKey() {
		return authorizationKey;
	}

	public void setAuthorizationKey(String authorizationKey) {
		this.authorizationKey = authorizationKey;
	}
	public List<? extends GrantedAuthority> getRoles() {
		return roles;
	}
	public void setRoles(List<? extends GrantedAuthority> roles) {
		this.roles = roles;
	}

	
}
