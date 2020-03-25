package fr.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.beans.Role;
import fr.formation.services.IRoleService;



@SpringBootApplication
public class ProjetBanqueApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetBanqueApplication.class, args);
	}

	
	@Autowired
	IRoleService roleServ;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Role r1 = new Role();
//			r1.setRoleUser("Client");
//		roleServ.createRole(r1);
	}

	

	

}
