package fr.formation.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Operation {
	private long idOperation;
	private Double montant;
	private Date dateAction;
	private Compte CompteEmetteur;
	private Compte CompteRecepteur;
	
	
	
	
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Operation(Double montant, Date dateAction, Compte compteEmetteur, Compte compteRecepteur) {
		super();
		this.montant = montant;
		this.dateAction = dateAction;
		CompteEmetteur = compteEmetteur;
		CompteRecepteur = compteRecepteur;
	}

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(long idOperation) {
		this.idOperation = idOperation;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Date getDateAction() {
		return dateAction;
	}

	public void setDateAction(Date dateAction) {
		this.dateAction = dateAction;
	}

	@OneToOne
	public Compte getCompteEmetteur() {
		return CompteEmetteur;
	}

	public void setCompteEmetteur(Compte compteEmetteur) {
		CompteEmetteur = compteEmetteur;
	}
	
	@OneToOne
	public Compte getCompteRecepteur() {
		return CompteRecepteur;
	}

	public void setCompteRecepteur(Compte compteRecepteur) {
		CompteRecepteur = compteRecepteur;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Operation [idOperation=" + idOperation + ", montant=" + montant + ", dateAction=" + dateAction
				+ ", CompteEmetteur=" + CompteEmetteur + ", CompteRecepteur=" + CompteRecepteur + "]";
	}

	
	
	

}
