package com.bldea.crorepathiapp;

public class candidate {
      private String name;
      private int age;
      private String city;
      private String state;
      static int amount;
	/**
	 * @param name
	 * @param age
	 * @param city
	 * @param state
	 */
	public candidate(String name, int age, String city, String state) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.state = state;
	}
	
	/**
	 * @param amount the amount to set
	 */
	public static void setAmount(int amt) {
          amount = amt;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
      
	
}
