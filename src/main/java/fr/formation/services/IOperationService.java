package fr.formation.services;

import java.util.List;

import fr.formation.beans.Operation;

public interface IOperationService {

	public Operation createOperation(Operation op);
	public List<Operation> getAllOperation();
	public Operation getOperationById(long idO);
//	public Operation updateOperation(Operation op);
//	public int deleteOperation(long idO);
	
}
