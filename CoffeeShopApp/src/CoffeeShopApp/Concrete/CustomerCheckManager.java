package CoffeeShopApp.Concrete;

import CoffeeShopApp.Abstract.CustomerCheckService;
import CoffeeShopApp.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

}
