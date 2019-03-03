package com.cmarchive.bank.bankoauth2authorizationserver.domaine;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@EqualsAndHashCode(of = {"id"})
public class Role {

	public Role() {
		super();
	}

	@Id
	@GeneratedValue
	public Long id;
	
	private String role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
