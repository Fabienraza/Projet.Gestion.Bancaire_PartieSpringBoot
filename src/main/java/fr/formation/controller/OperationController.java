package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.formation.beans.Operation;
import fr.formation.services.IOperationService;



@RestController
@RequestMapping("operation")
@CrossOrigin("http://localhost:4200")
public class OperationController {

	//Declaration d'un objet de type "ICompteService" pour acceder aux methodes
	@Autowired
	IOperationService operationserv;
	
	
	/****************************************
	 * Instruction pour creer une operation *
	 ****************************************/
	@PostMapping("/add")
	public Operation ajoutOp(@RequestBody Operation op) {
		return operationserv.createOperation(op);
	}
	
	
	
	/*****************************************************
	 * Instruction pour afficher la liste des opérations *
	 *****************************************************/
	@GetMapping("/all")
	public List<Operation> listeOperation() {
		return operationserv.getAllOperation();
	}
	
	
	
	/**************************************************************
	 * Instruction pour rechercher une operation à partir de l'id *
	 **************************************************************/
	@GetMapping("/find/{idO}")
	public Operation rechercheOp(@PathVariable long idO) {
		return operationserv.getOperationById(idO);
	}
	
	
}
