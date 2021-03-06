package com.kylar.Repo;

import java.util.List;

import com.kylar.Domain.Equipment;
import com.kylar.Domain.ShopItem;

public interface EquipmentRepo {
	Equipment getEquipment(String item);
	void updateEqipmentInfo(Equipment equipment);
	void removeEquipment(Equipment equipment);
	List<Equipment> getAllEquipment();
	List<Equipment> getAllSellable();
	List<Equipment> getAllUpgradable();
	void addEquipment(ShopItem shopItem);
}

