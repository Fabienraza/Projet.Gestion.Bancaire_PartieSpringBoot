package fr.formation.services;

import java.util.List;
import fr.formation.beans.User;

public interface IUserService {
	
	public User createUser(User user);
	public List<User> getAllUser();
	public User getUserById(long idU);
	public User updateUser(User user);
	public int deleteUser(long idU);
	
}
