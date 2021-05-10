package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	
	public void signIn(User user);
	public void login(User user);

}
