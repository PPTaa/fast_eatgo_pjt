package kr.co.fastcampus.eatgo.domain;

public class Restaurant {

	private final String name;
	private final String address;

	public Restaurant(String name, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getInformation() {
		// TODO Auto-generated method stub
		return name + " in " + address;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

}
