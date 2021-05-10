package eCommerceDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.core.abstracts.UsernameValidationService;
import eCommerceDemo.entities.concretes.User;

public class UsernameValidationManager implements UsernameValidationService {

	@Override
	public boolean isUsernameValid(User user) {
		String validRegex = "[a-zA-Z0-9@.#-_]{2,}";
		Pattern checkRegex = Pattern.compile(validRegex);
		Matcher regexFirstName = checkRegex.matcher(user.getFirstName());
		Matcher regexLastName = checkRegex.matcher(user.getLastName());
		if(regexFirstName.find() && regexLastName.find()) {
			return true;
		}else {
			return false;
		}
	}

}
