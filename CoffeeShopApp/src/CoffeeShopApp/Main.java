package CoffeeShopApp;


import CoffeeShopApp.Abstract.BaseCustomerManager;
import CoffeeShopApp.Abstract.CustomerCheckService;
import CoffeeShopApp.Adapters.MernisServiceAdapter;
import CoffeeShopApp.Concrete.NeroCustomerManager;
import CoffeeShopApp.Concrete.StarbucksCustomerManager;
import CoffeeShopApp.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Eda");
		customer.setLastName("Arabacı");
		customer.setDateOfBirth(1992);
		customer.setNationalId("47845944274");
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter() );
		customerManager.Save(customer);

	}

}
