package OBS;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setUserName("firstMember"); ;
		user.setFirstName("Eda");
		user.setLastName("Arabaci");
		user.setPassword("12345");
		user.setEmail("eda@eda.com");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setInstructorId(2);
		instructor.setUserName("secondMember");
		instructor.setFirstName("Elif");
		instructor.setLastName("Kara");
		instructor.setPassword("78900");
		instructor.setEmail("elif@elif.com");
		instructor.setField("Fizik");
		instructor.setEducation("YTU");
		
		Student student = new Student();
		student.setId(3);
		student.setStudentId(3);
		student.setUserName("thirdMember");
		student.setFirstName("Ahmet");
		student.setLastName("Kaya");
		student.setPassword("111213");
		student.setEmail("ahmet@ahmet.com");
		student.setCollageName("ITU");
		student.setEducationLevel("Senior");
		
		
		UserManager userManager = new UserManager();
		userManager.login(user);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		

	}

}
