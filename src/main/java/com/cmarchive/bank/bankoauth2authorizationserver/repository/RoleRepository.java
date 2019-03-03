package com.cmarchive.bank.bankoauth2authorizationserver.repository;

import com.cmarchive.bank.bankoauth2authorizationserver.domaine.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	public Role findByRole(String role);
	
}
