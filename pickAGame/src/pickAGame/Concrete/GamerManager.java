package pickAGame.Concrete;

import pickAGame.Abstract.GamerCheckService;
import pickAGame.Abstract.GamerService;
import pickAGame.Entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void addGamer(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) 
		{
			System.out.println("Gamer eklendi : " + gamer.getFirstName());
		}
		else {
			System.out.println("Confirmation failed: User is not valid");
		}
		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) 
		{
			System.out.println("Gamer guncellendi : " + gamer.getFirstName());
		}else {
				System.out.println("Confirmation failed: User is not valid");
			}
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println("Gamer silindi : " + gamer.getFirstName());
		
	}

	@Override
	public void listGames(Gamer gamer) {
		
		System.out.println("Games listelendi.");
		
	}
	
	

}
