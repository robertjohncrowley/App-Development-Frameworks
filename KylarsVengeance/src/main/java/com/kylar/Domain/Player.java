package com.kylar.Domain;

public class Player {
	
	String firstName, lastName, ign;
	int id, balance, health;
	
	public Player(String firstName, String lastName, String ign, int balance, int health) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ign = ign;
		this.balance = balance;
		this.health = health;
	}
	
	public Player() {

	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIgn() {
		return ign;
	}
	public void setIgn(String ign) {
		this.ign = ign;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}

}
