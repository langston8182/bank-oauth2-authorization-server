package com.cmarchive.bank.bankoauth2authorizationserver.repository;

import com.cmarchive.bank.bankoauth2authorizationserver.domaine.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public List<User> findAllByOrderByNomAsc();
	
	public User findByEmail(String email);
	
}
