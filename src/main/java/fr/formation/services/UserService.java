package fr.formation.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.formation.beans.User;
import fr.formation.repository.IUserRepository;


@Service
public class UserService implements IUserService{

	// Declaration d'un objet type "IUserRepository" pour avoir acces a la BD
	@Autowired
	IUserRepository userrepository;
	
	
	
	/*********************************************
	 * Methode pour creer un nouveau utilisateur *
	 *********************************************/
	
	@Override
	public User createUser(User user) {
		try {
			return userrepository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

	/***********************************************************************
	 * Methode pour afficher la liste des utilisateurs presents dans la BD *
	 ***********************************************************************/
	
	@Override
	public List<User> getAllUser() {
		try {
			return userrepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	/*********************************************************
	 * Methode recherche d'un utilisateur à partir de son id *
	 *********************************************************/
	
	@Override
	public User getUserById(long idU) {
		Optional<User> userOptional = userrepository.findById(idU);
		User userFind = new User();
		
		if(userOptional.isPresent() == true) {
			userFind = userOptional.get();
		}
		
		return userFind;
	}
	
	

	/******************************************************
	 * Methode pour modifier les données d'un utilisateur *
	 ******************************************************/
	
	@Override
	public User updateUser(User user) {
		try {
			return userrepository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	/****************************************************
	 * Methode pour supprimer un utilisateur dans la BD *
	 ****************************************************/
	
	@Override
	public int deleteUser(long idU) {
		try {
			userrepository.deleteById(idU);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	

}
