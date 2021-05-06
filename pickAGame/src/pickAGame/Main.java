package pickAGame;

import pickAGame.Adapters.MernisServiceAdapter;
import pickAGame.Concrete.GamerManager;
import pickAGame.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		

		Gamer gamer = new Gamer(1,"FirstUser","Eda","Arabacı","111111",11,"SeaOfThieves");
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.addGamer(gamer);
		

	}

}
