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
import fr.formation.beans.User;
import fr.formation.services.IUserService;



@RestController
@RequestMapping("user")
@CrossOrigin("http://localhost:4200")
public class UserController {

	// Declaration d'un objet de type "IUserService" pour accerder aux méthodes
	@Autowired
	IUserService userServ;
	
	
	/******************************************************
	 * Instruction pour ajouter un utilisateur dans la BD *
	 ******************************************************/
	@PostMapping("/add")
	public User ajoutUser(@RequestBody User user) {
		return userServ.createUser(user);
	}
	
	
	/***********************************************************************
	 * Instruction pour afficher la liste des utilisateurs présent dans BD *
	 ***********************************************************************/
	@GetMapping("/all")
	public List<User> listeUser() {
		return userServ.getAllUser();
	}
	
	
	/*************************************************************
	 * Instruction pour rechercher un utilisateur suivant son id *
	 *************************************************************/
	@GetMapping("/find/{id}")
	public User rechercheUser(@PathVariable long id) {
		return userServ.getUserById(id);
	}
	
	
	/**********************************************************
	 * Instruction pour modifier les donnees d'un utilisateur *
	 **********************************************************/
	@PutMapping("/update/{idU}")
	public User modifuser(@PathVariable long idU, @RequestBody User user) {
		User UserAModif = new User();
			UserAModif.setPassword(user.getPassword());
			UserAModif.setNomUser(user.getNomUser());
			UserAModif.setAdresse(user.getAdresse());
			UserAModif.setPrenomUser(user.getPrenomUser());
			UserAModif.setDateDenaissance(user.getDateDenaissance());
			UserAModif.setRole(user.getRole());
		return userServ.updateUser(UserAModif);
	}

	
	/*********************************************
	 * Instruction pour supprimer un utilisateur *
	 *********************************************/
	@DeleteMapping("/delete/{idU}")
	public int suppUser(@PathVariable long idU) {
		return userServ.deleteUser(idU);
	}
	
	
	
}
