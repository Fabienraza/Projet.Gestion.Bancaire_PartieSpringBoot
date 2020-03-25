package fr.formation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.formation.beans.Operation;
import fr.formation.repository.IOperationRepository;

@Service
public class OperationService implements IOperationService{

	
	// Declaration d'un objet de type "IOperationRepository" pour acceder à la BD
	@Autowired
	IOperationRepository operationrepository;
	
	
	
	/*********************************************
	 * Methode pour creer une nouvelle operation * 
	 *********************************************/
	
	@Override
	public Operation createOperation(Operation op) {
		try {
			return operationrepository.save(op);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	
	/*************************************************
	 * Methode pour afficher la liste des opérations *
	 *************************************************/
	
	@Override
	public List<Operation> getAllOperation() {
		try {
			return operationrepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	
	/**********************************************************
	 * Methode pour rechercher une opération à partir de l'id *
	 **********************************************************/
	@Override
	public Operation getOperationById(long idO) {
		Optional<Operation> operationOptional = operationrepository.findById(idO);
		Operation opFind = new Operation();
		
		if(operationOptional.isPresent() == true) {
			opFind = operationOptional.get();
		}
		
		return opFind;
	 }

	
//	/******************************************************
//	 * Methode pour modifier les données d'une opéération *
//	 *****************************************************/
//	@Override
//	public Operation updateOperation(Operation op) {
//		try {
//			return operationrepository.save(op);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
//	
//	
//	
//	/***************************************************
//	 * Methode pour supprimer une operation dans la Bd *
//	 ***************************************************/
//	@Override
//	public int deleteOperation(long idO) {
//		try {
//			operationrepository.deleteById(idO);
//			return 1;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		}
//	}
	
}
