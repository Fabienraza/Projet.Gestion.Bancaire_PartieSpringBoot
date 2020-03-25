package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.formation.beans.User;


public interface IUserRepository extends JpaRepository<User, Long>{

}
