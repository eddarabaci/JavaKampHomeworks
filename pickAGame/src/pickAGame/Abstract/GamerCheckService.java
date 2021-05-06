package pickAGame.Abstract;

import pickAGame.Entities.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);
}
