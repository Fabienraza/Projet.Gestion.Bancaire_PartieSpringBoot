package fr.formation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.beans.Compte;
import fr.formation.repository.ICompteRepository;


@Service
public class CompteService implements ICompteService{

	// Declaration d'un objet de type "ICompteRepository" pour acceder à la BD
	@Autowired
	ICompteRepository compterepository;
	
	
	
	/******************************************
	 * Methode pour ajouter un nouveau compte *
	 ******************************************/
	
	@Override
	public Compte createCompte(Compte cpt) {
		try {
			return compterepository.save(cpt);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	/***************************************************************************
	 *  Methode pour afficher la liste de tous les comptes presents dans la BD *
	 ***************************************************************************/
	
	@Override
	public List<Compte> getAllCompte() {
		try {
			return compterepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	
	/*******************************************************
	 *  Methode pour rechercher un compte à partir de l'id *
	 *******************************************************/
	
	@Override
	public Compte getCompteById(long idC) {
		Optional<Compte> compteOptional = compterepository.findById(idC);
		Compte compteFind = new Compte();
		
		if(compteOptional.isPresent() == true) {
			compteFind = compteOptional.get();
		}
		return compteFind; 
	}
	
	
	
	/*************************************************
	 * Methode pour modifier les données d'un compte *
	 *************************************************/
	
	@Override
	public Compte updateCompte(Compte cpt) {
		try {
			return compterepository.save(cpt);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/****************************************************
	 * Methode pour supprier un compte à partir de l'id *
	 ****************************************************/
	
	@Override
	public int deleteCompte(long idC) {
		try {
			compterepository.deleteById(idC);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	

}
