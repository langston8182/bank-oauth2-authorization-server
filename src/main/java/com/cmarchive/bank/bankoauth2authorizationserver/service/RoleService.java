package com.cmarchive.bank.bankoauth2authorizationserver.service;


import com.cmarchive.bank.bankoauth2authorizationserver.domaine.Role;

public interface RoleService {

	public Role get(String role);
	
	public Role findByRole(String role);
	
}
