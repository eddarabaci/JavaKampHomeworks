package pickAGame.Abstract;

import pickAGame.Entities.Gamer;

public interface GamerService {
	
	void addGamer(Gamer gamer);
	void updateGamer(Gamer gamer);
	void deleteGamer(Gamer gamer);
	void listGames(Gamer gamer);

}
