package eCommerceDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.core.abstracts.PasswordValidationService;
import eCommerceDemo.entities.concretes.User;

public class PasswordValidationManager implements PasswordValidationService{

	@Override
	public boolean isPasswordValid(User user) {
		String validRegex = "[a-zA-Z0-9@.#-_]{6,}";
		Pattern checkRegex = Pattern.compile(validRegex);
		Matcher regexPassword = checkRegex.matcher(user.getPassword());
		if(regexPassword.find()) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
