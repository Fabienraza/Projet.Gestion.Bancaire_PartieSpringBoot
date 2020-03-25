package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.formation.beans.Operation;



public interface IOperationRepository extends JpaRepository<Operation, Long>{

}
