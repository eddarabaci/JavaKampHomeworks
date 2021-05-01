package OBS;

public class UserManager {
	
	public void login(User user) {
		
		System.out.println("Login bilgileri kontrol ediliyor");
		System.out.println(user.getFirstName()+ " Hosgeldiniz");
		
		
	}
	
	public void add(User user) {
			
			System.out.println(user.getFirstName()+ " Eklendi");
			
			
	}
	

}
