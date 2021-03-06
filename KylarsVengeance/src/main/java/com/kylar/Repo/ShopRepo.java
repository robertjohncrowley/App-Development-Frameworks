package com.kylar.Repo;

import java.util.List;

import com.kylar.Domain.ShopItem;

public interface ShopRepo {	
	void addToShop(ShopItem equipment);
	void purchase(ShopItem equipment);
	List<ShopItem> getStock();
	void dropStock(ShopItem shopItem);
	void removeFromShop(ShopItem shopItem);
}
