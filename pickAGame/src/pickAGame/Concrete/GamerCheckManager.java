package pickAGame.Concrete;

import pickAGame.Abstract.GamerCheckService;
import pickAGame.Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}

	

}
