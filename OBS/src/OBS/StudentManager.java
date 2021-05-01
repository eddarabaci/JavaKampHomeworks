package OBS;

public class StudentManager extends UserManager{
	
	public void add(User user){
		super.add(user);
		System.out.println(user.getFirstName()+ " ogrenci olarak eklendi");
		
	}
	

}
