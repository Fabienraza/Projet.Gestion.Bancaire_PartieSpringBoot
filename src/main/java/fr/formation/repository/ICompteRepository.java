package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.formation.beans.Compte;


public interface ICompteRepository extends JpaRepository< Compte, Long>{

}
