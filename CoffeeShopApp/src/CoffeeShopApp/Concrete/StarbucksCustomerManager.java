package CoffeeShopApp.Concrete;

import CoffeeShopApp.Abstract.BaseCustomerManager;
import CoffeeShopApp.Abstract.CustomerCheckService;
import CoffeeShopApp.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Not valid person");
		}
		
		
	}
	
}
