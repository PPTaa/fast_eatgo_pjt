package kr.co.fastcampus.eatgo.domain;

import lombok.Getter;

@Getter
public class Restaurant {

	private final String name;
	private final String address;
	private final Long id;

	public Restaurant(Long id, String name, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		this.id = id;
	}

	public String getInformation() {
		// TODO Auto-generated method stub
		return name + " in " + address;
	}
}
