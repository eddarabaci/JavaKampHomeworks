package OBS;

public class InstructorManager extends UserManager{
	
	public void add(User user){
		super.add(user);
		System.out.println(user.getFirstName()+ " egitmen olarak eklendi");
		
	}
	
	

}
