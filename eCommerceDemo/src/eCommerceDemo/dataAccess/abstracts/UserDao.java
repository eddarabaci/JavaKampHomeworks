package eCommerceDemo.dataAccess.abstracts;

import java.util.ArrayList;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	
	public void add(User user);
	public void update(User user);
	public void delete(User user);
	ArrayList<String> getEmail();
	boolean isContain(User user);
	

}
