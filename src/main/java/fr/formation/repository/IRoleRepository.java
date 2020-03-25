package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.formation.beans.Role;


public interface IRoleRepository extends JpaRepository<Role, Long>{

}
