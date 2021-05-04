package CoffeeShopApp.Adapters;
import java.rmi.RemoteException;

import CoffeeShopApp.Abstract.CustomerCheckService;
import CoffeeShopApp.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		try {
			kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), 
							customer.getFirstName().toUpperCase(), 
							customer.getLastName().toUpperCase(), 
							customer.getDateOfBirth());
			
		} 
		catch (NumberFormatException exception) {
			exception.printStackTrace();
		} 
		catch (RemoteException exception) {
			exception.printStackTrace();
		}
		return false;
		}

}
