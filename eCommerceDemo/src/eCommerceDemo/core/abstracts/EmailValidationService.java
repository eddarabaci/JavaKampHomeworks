package eCommerceDemo.core.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface EmailValidationService {
	
	boolean isEmailValid(User user);
	boolean duplicatedEmail(User user);

}
