package pickAGame.Entities;

import pickAGame.Abstract.Entity;

public class Game implements Entity {
	
	int gameId;
	int campaignId;
	String gameName;
	int gamePrice;
	int afterDiscount;
	int unitInStock;
	
	
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	
	public int getCampaignId() {
		return campaignId;
	}
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	public int getAfterDiscount() {
		return afterDiscount;
	}
	public void setAfterDiscount(int afterDiscount) {
		this.afterDiscount = afterDiscount;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	

}
