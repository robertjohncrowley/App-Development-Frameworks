package com.kylar.Domain;

public class Equipment {
	String item;
	int protection, damage, durability, currentLevel, priceForUpgrade, sale, salePrice;
	
	public Equipment(){
		
	}
	
	public Equipment(String item, int protection, int damage, int durability, 
			int currentLevel, int priceForUpgrade, int sale, int salePrice){
		super();
		this.item = item;
		this.protection = protection;
		this.damage = damage;
		this.durability = durability;
		this.currentLevel = currentLevel;
		this.sale = sale;
		this.priceForUpgrade = priceForUpgrade;
		this.salePrice = salePrice;
	}
	
	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getProtection() {
		return protection;
	}
	public void setProtection(int protection) {
		this.protection = protection;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
	public int getCurrentLevel() {
		return currentLevel;
	}
	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}
	public int getPriceForUpgrade() {
		return priceForUpgrade;
	}
	public void setPriceForUpgrade(int priceForUpgrade) {
		this.priceForUpgrade = priceForUpgrade;
	}
}
