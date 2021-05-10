package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateDao implements UserDao {

	private ArrayList<String> emails = new ArrayList<>();
	private ArrayList<User> users = new ArrayList<>();
	
	@Override
	public void add(User user) {
		
		System.out.println("Kullanıcı eklendi.");
		emails.add(user.getEmail());
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı silindi");
		emails.remove(user.getEmail());
		users.remove(user);
		
	}

	@Override
	public ArrayList<String> getEmail() {
		return emails;
	}

	@Override
	public boolean isContain(User user) {
		if (users.contains(user)) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
