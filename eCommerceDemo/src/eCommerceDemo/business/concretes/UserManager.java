package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstracts.EmailValidationService;
import eCommerceDemo.core.abstracts.EmailVerificationService;
import eCommerceDemo.core.abstracts.PasswordValidationService;
import eCommerceDemo.core.abstracts.UsernameValidationService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	private EmailValidationService emailValidationService;
	private PasswordValidationService passwordValidationService;
	private UsernameValidationService usernameValidationService;
	private UserDao userDao;
	private EmailVerificationService emailVerificationService;
	

	
	

public UserManager(EmailValidationService emailValidationService,
			PasswordValidationService passwordValidationService, UsernameValidationService usernameValidationService,
			UserDao userDao, EmailVerificationService emailVerificationService) {
		super();
		this.emailValidationService = emailValidationService;
		this.passwordValidationService = passwordValidationService;
		this.usernameValidationService = usernameValidationService;
		this.userDao = userDao;
		this.emailVerificationService = emailVerificationService;
	}

public void signInByDefault(User user) {
	
	
		
		boolean isContain = userDao.getEmail().contains(user.getEmail());
		
		if (!isContain) {
			
			if (emailValidationService.isEmailValid(user) && passwordValidationService.isPasswordValid(user)
					&& usernameValidationService.isUsernameValid(user) && emailVerificationService.isEmailVerified(user)
					) {
					userDao.add(user);
				}
				else {
					try {
						throw new Exception("Kullanici isim bilgileri en az 2 karakter olmalidir.\n"
										  + "Sifre en az 6 karakter olmalidir.\n"
										  + "Email adresi dogru standartta girilmelidir.");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		}else {
			System.out.println("This email address is used by another User.");
		}

		
		
	}

	@Override
	public void signIn(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(User user) {
		boolean isContain = userDao.getEmail().contains(user.getEmail());

		if (userDao.isContain(user)) {
			System.out.println("Welcome " + user.getFirstName() + " " + user.getLastName());
		}
		else {
			System.out.println("Before you login you should signUp.");
		}
		
	}

}
