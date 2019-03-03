package com.cmarchive.bank.bankoauth2authorizationserver.service.impl;

import com.cmarchive.bank.bankoauth2authorizationserver.domaine.Role;
import com.cmarchive.bank.bankoauth2authorizationserver.repository.RoleRepository;
import com.cmarchive.bank.bankoauth2authorizationserver.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    public RoleRepository roleRepository;
    
    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        super();
        this.roleRepository = roleRepository;
    }

    @Override
    public Role get(String role) {
        return roleRepository.findByRole(role);
    }

	@Override
	public Role findByRole(String role) {
		return roleRepository.findByRole(role);
	}
    
}
