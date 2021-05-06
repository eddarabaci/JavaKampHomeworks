package pickAGame.Adapters;

import java.rmi.RemoteException;

import pickAGame.Abstract.GamerCheckService;
import pickAGame.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		try {
			return kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()), 
					gamer.getFirstName().toUpperCase(), 
					gamer.getLastName().toUpperCase(), 
					gamer.getYearOfBirth());
			
			
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
