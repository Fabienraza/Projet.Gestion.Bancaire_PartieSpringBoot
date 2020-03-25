package fr.formation.services;

import java.util.List;

import fr.formation.beans.Role;

public interface IRoleService {
	
	public Role createRole(Role r);
	public List<Role> getAllRole();
	public Role getRoleById(long idR);
	public Role updateRole(Role r);
	public int deleteRole(long idR);
	
}
