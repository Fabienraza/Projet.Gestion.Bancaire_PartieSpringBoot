package fr.formation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.formation.beans.Role;
import fr.formation.repository.IRoleRepository;



@Service
public class RoleService implements IRoleService{

	// Déclaration d'un objet de type rolerepository pour avoir accès à la BD
	@Autowired
	IRoleRepository rolerepository;
	
	
	/***************************************
	 *  Methode pour creer un nouveau rôle *
	 ***************************************/
	
	@Override
	public Role createRole(Role r) {
		try {
			return rolerepository.save(r);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	/*****************************************************************
	 *  Methode pour afficher la liste des roles presents dans la BD * 
	 *****************************************************************/
	
	@Override
	public List<Role> getAllRole() {
		try {
			return rolerepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	/**************************************************
	 * Methode pour rechercher un role suivant son id *
	 **************************************************/
	
	@Override
	public Role getRoleById(long idR) {
		Optional<Role> roleOptional = rolerepository.findById(idR);
		Role roleFind = new Role();
		
		if(roleOptional.isPresent() == true) {
			roleFind= roleOptional.get();
		}
		
		return roleFind;
	}
	
	
	/************************************************
	 *  Methode pour modifier les données d'un rôle *
	 ***********************************************/
	
	@Override
	public Role updateRole(Role r) {
		try {
			return rolerepository.save(r);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	/**********************************************
	 * Methode pour supprimer une role dans la BD *
	 **********************************************/
	
	@Override
	public int deleteRole(long idR) {
		try {
			rolerepository.deleteById(idR);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}



}
