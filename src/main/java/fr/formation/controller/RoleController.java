package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.beans.Role;
import fr.formation.services.IRoleService;


@RestController
@RequestMapping ("role")
@CrossOrigin ("http://localhost:4200")
public class RoleController {

	
	// Decralration d'un objet de type "IRoleService" pour accreder aux methodes
	@Autowired
	IRoleService roleservice;
	
	
	/******************************************
	 * Instruction pour creer un nouveau role *
	 ******************************************/
	@PostMapping("/add")
	public Role ajoutRole(@RequestBody Role r) {
		return roleservice.createRole(r);
	}	
	
	
	/************************************************
	 * Instruction pour afficher la liste des roles *
	 ************************************************/
	@GetMapping ("/all")
	public List<Role> listeRoles(){
		return roleservice.getAllRole();
	}
	
	
	/****************************************************
	 * Instruction pour afficher un role suivant son id * 
	 ****************************************************/
	@GetMapping("/find/{idR}")
	public Role rechercheRole(@PathVariable long idR) {
		return roleservice.getRoleById(idR);
	}
	
	
	/*************************************
	 * Instruction pour modifier un role *
	 *************************************/
	@PutMapping("/update/{idR}")
	public Role modifRole(@PathVariable long idR , @RequestBody Role role) {
		Role roleAModif = roleservice.getRoleById(idR);
			roleAModif.setRoleUser(role.getRoleUser());
			
		return roleservice.updateRole(roleAModif);
	}
	
	
	/**************************************
	 * Instruction pour supprimer un role *
	 **************************************/
	@DeleteMapping("/delete/{idR}")
	public int suppRole(@PathVariable long idR) {
		return roleservice.deleteRole(idR);
	}
	
}
