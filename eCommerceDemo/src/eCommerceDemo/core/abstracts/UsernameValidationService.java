package eCommerceDemo.core.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UsernameValidationService {
	
	boolean isUsernameValid(User user);

}
