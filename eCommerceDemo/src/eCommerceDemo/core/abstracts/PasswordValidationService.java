package eCommerceDemo.core.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface PasswordValidationService {
	boolean isPasswordValid(User user);
}
