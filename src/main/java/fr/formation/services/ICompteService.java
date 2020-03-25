package fr.formation.services;

import java.util.List;

import fr.formation.beans.Compte;

public interface ICompteService {
	
	public Compte createCompte(Compte cpt);
	public List<Compte> getAllCompte();
	public Compte getCompteById(long idC);
	public Compte updateCompte(Compte cpt);
	public int deleteCompte(long idC);
	
}
