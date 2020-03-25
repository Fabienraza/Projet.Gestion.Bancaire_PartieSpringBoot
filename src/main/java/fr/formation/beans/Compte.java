package fr.formation.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Compte {
	
	
	private long idCompte;
	private String typeCompte;
	private Double soldeCompte;
	private User conseiller;
	private User client;
	
	
	
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(long idCompte, String typeCompte, Double soldeCompte, User conseiller, User client) {
		super();
		this.idCompte = idCompte;
		this.typeCompte = typeCompte;
		this.soldeCompte = soldeCompte;
		this.conseiller = conseiller;
		this.client = client;
	}







	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public Double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(Double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	@ManyToOne
	public User getConseiller() {
		return conseiller;
	}

	public void setConseiller(User conseiller) {
		this.conseiller = conseiller;
	}

	@ManyToOne
	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	
	
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", typeCompte=" + typeCompte + ", soldeCompte=" + soldeCompte
				+ ", conseiller=" + conseiller + ", client=" + client + "]";
	}

	
	

}
