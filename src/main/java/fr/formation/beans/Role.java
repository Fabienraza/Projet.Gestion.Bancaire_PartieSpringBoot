package fr.formation.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Role {
	
	
	private long idRole;
	private String RoleUser;
	
	
	
	
	
	public Role() {

	}

	public Role(long idRole, String roleUser) {
		super();
		this.idRole = idRole;
		RoleUser = roleUser;
	}

	
	
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	public String getRoleUser() {
		return RoleUser;
	}

	public void setRoleUser(String roleUser) {
		RoleUser = roleUser;
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", RoleUser=" + RoleUser + "]";
	}
	
	



}
