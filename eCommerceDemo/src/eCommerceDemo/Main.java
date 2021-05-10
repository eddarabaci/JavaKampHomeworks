package eCommerceDemo;

import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.concretes.EmailValidationManager;
import eCommerceDemo.core.concretes.EmailVerificationManager;
import eCommerceDemo.core.concretes.PasswordValidationManager;
import eCommerceDemo.core.concretes.UsernameValidationManager;
import eCommerceDemo.dataAccess.concretes.HibernateDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Eda","Arabaci","123456test","eda.arabaci@eda.com");
		
		UsernameValidationManager name = new UsernameValidationManager();
		EmailValidationManager email = new EmailValidationManager();
		PasswordValidationManager password = new PasswordValidationManager();
		HibernateDao dataAccess = new HibernateDao();
		
		UserManager userManager = new UserManager(email, password, name, dataAccess, new EmailVerificationManager());
		
		userManager.signIn(user);
		userManager.login(user);

	}

}
