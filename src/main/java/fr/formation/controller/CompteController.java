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

import fr.formation.beans.Compte;
import fr.formation.services.ICompteService;


@RestController
@RequestMapping("compte")
@CrossOrigin("http://localhost:4200")
public class CompteController {
	
	// Declaration d'un objet de type "ICompteService"
	@Autowired
	ICompteService compteServ;
	
	
	
	/**********************************************
	 * Instruction pour ajouter un nouveau compte *
	 **********************************************/
	@PostMapping("/add")
	public Compte ajoutCompte(@RequestBody Compte cpt) {
		return compteServ.createCompte(cpt);
	}
	
	
	/***************************************************
	 * Instruction pour affichier la liste des comptes *
	 ***************************************************/
	@GetMapping("/all")
	public List<Compte> listeCompte() {
		return compteServ.getAllCompte();
	}
	
	
	/**********************************************************
	 * Instruction pour rechercher un compte a partir de l'id *
	 **********************************************************/
	@GetMapping("/find/{id}")
	public Compte rechercheCompte(@PathVariable long id) {
		return compteServ.getCompteById(id);
	}
	

	/****************************************************
	 * Instruction pour modifier les donnes d'un Compte *
	 ****************************************************/
	@PutMapping("/update/{idC}")
	public Compte modifCompte(long idC , Compte cpt) {
		Compte cp = new Compte();
			cp.setTypeCompte(cpt.getTypeCompte());
			cp.setSoldeCompte(cpt.getSoldeCompte());
			cp.setConseiller(cpt.getConseiller());
			cp.setClient(cpt.getClient());
		return compteServ.updateCompte(cp);
	}
	
	
	/****************************************
	 * Instruction pour supprimer un compte *
	 ****************************************/
	@DeleteMapping("/delete/{idC}")
	public int suppCompte(@PathVariable long idC) {
		return compteServ.deleteCompte(idC);
	}
	
	
	
}
