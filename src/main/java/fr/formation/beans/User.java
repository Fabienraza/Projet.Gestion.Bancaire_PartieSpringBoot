package fr.formation.beans;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class User {
	
	private long idUser;
	private String password;
	private String nomUser;
	private String prenomUser;
	private Date dateDenaissance;
	private String adresse;
	private Role role;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String password, String nomUser, String prenomUser, Date dateDenaissance, String adresse, Role role) {
		super();
		this.password = password;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.dateDenaissance = dateDenaissance;
		this.adresse = adresse;
		this.role = role;
	}

	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	public Date getDateDenaissance() {
		return dateDenaissance;
	}

	public void setDateDenaissance(Date dateDenaissance) {
		this.dateDenaissance = dateDenaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@OneToOne
	@JoinColumn (name="idRole")
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	
	
	
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", password=" + password + ", nomUser=" + nomUser + ", prenomUser="
				+ prenomUser + ", dateDenaissance=" + dateDenaissance + ", adresse=" + adresse + ", role=" + role + "]";
	}


	
	
	
	

	

}
