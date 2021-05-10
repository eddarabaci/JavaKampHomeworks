package eCommerceDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.core.abstracts.EmailValidationService;
import eCommerceDemo.entities.concretes.User;

public class EmailValidationManager implements EmailValidationService{

	@Override
	public boolean isEmailValid(User user) {
		String theValidRegex = "[A-Za-z0-9._\\%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
		
		Pattern checkRegex = Pattern.compile(theValidRegex);
		Matcher regaxMatcher = checkRegex.matcher(user.getEmail());
		if (regaxMatcher.find()) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean duplicatedEmail(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
