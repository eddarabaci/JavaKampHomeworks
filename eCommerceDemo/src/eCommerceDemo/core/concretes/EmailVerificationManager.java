package eCommerceDemo.core.concretes;

import java.util.Scanner;

import eCommerceDemo.core.abstracts.EmailVerificationService;
import eCommerceDemo.entities.concretes.User;

public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public boolean isEmailVerified(User user) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Verified your e-mail : "+ user.getEmail());
		System.out.println("Please type true if this is your email, otherwise type false");
		String verification = scan.nextLine();
		
		if(verification.equals("true")) {
			System.out.println("Email is verified");
			return true;
		} 
		else{
			System.out.println("This email is not verified.");
			return false;
		}
	}

}
