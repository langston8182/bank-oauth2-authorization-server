package com.cmarchive.bank.bankoauth2authorizationserver.service.impl;

import com.cmarchive.bank.bankoauth2authorizationserver.domaine.User;
import com.cmarchive.bank.bankoauth2authorizationserver.exception.UserNotFoundException;
import com.cmarchive.bank.bankoauth2authorizationserver.repository.UserRepository;
import com.cmarchive.bank.bankoauth2authorizationserver.service.RoleService;
import com.cmarchive.bank.bankoauth2authorizationserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {

    private UserRepository userRepository;
    private RoleService roleService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleService roleService) {
        super();
        this.userRepository = userRepository;
        this.roleService = roleService;
    }
    
    @Override
    public List<User> list() {
        return userRepository.findAllByOrderByNomAsc();
    }
    
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
    
    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
    
    @Override
    public User get(Long id) {
    	Assert.notNull(id, "Id cannot be null");
    	
    	User user = userRepository.getOne(id);
    	
    	if (user == null) {
            throw new UserNotFoundException("User with id " + id + " not found.");
        }
        
        return user;
    }
    
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        
        return user;
    }

    @Override
    public void encodePassword(User user) {
        String password = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(password);
    }

    @Override
    public void setUserRole(User user) {
        user.getRoles().add(roleService.findByRole("ROLE_USER"));
    }
    
}
