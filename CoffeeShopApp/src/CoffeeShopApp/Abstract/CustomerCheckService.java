package CoffeeShopApp.Abstract;

import CoffeeShopApp.Entities.Customer;

public interface CustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer);

}
