package com.cmarchive.bank.bankoauth2authorizationserver.service;


import com.cmarchive.bank.bankoauth2authorizationserver.domaine.User;

import java.util.List;

public interface UserService {

	public List<User> list();
	
	public User save(User user);
	
	public void delete(User user);
	
	public User get(Long id);
	
	public User findByEmail(String email);

	public void encodePassword(User user);

	public void setUserRole(User user);
	
}
