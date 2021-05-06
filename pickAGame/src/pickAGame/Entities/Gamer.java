package pickAGame.Entities;

import pickAGame.Abstract.Entity;

public class Gamer implements Entity {
	
	int id;
	String userName;
	String firstName;
	String lastName;
	String nationalId;
	int yearOfBirth;
	String gameName;
	
	public Gamer(int id, String userName, String firstName, String lastName, String nationalId, int yearOfBirth,String gameName) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.yearOfBirth = yearOfBirth;
		this.gameName = gameName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	

}
