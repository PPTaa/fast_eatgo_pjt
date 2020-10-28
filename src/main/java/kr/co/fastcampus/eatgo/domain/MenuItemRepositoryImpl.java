package kr.co.fastcampus.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MenuItemRepositoryImpl implements MenuItemRepository {
	private List<MenuItem> menuItems = new ArrayList<>();

	public MenuItemRepositoryImpl() {
		// TODO Auto-generated constructor stub
		menuItems.add(new MenuItem("kimchi"));
	}
	
	@Override
	public List<MenuItem> findAllByRestaurantId(Long restaurantId) {
		// TODO Auto-generated method stub
		return menuItems;
	}

}
