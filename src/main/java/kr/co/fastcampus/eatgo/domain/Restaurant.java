package kr.co.fastcampus.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Restaurant {

	private final String name;
	private final String address;
	private final Long id;
	private List<MenuItem> menuItems = new ArrayList<MenuItem>();

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

	public void addMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		menuItems.add(menuItem);
	}

	public void setMenuItems(List<MenuItem> menuitems) {
		// TODO Auto-generated method stub
		for (MenuItem menuItem : menuitems) {
			addMenuItem(menuItem);
		}
		
	}
}
