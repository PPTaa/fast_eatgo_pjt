package kr.co.fastcampus.eatgo.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fastcampus.eatgo.domain.MenuItem;
import kr.co.fastcampus.eatgo.domain.MenuItemRepository;
import kr.co.fastcampus.eatgo.domain.Restaurant;
import kr.co.fastcampus.eatgo.domain.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepository restaurantRepository;
	@Autowired
	MenuItemRepository menuItemRepositroy;

	public RestaurantService(RestaurantRepository restaurantRepository, MenuItemRepository menuItemRepository) {
		this.restaurantRepository = restaurantRepository;
		this.menuItemRepositroy = menuItemRepository;
	}

	public Restaurant getRestaurant(Long id) {
		
		Restaurant restaurant = restaurantRepository.findById(id);
		List<MenuItem> menuitems = menuItemRepositroy.findAllByRestaurantId(id);
		restaurant.setMenuItems(menuitems);
		
		return restaurant;
	}

	public List<Restaurant> getRestaurants() {
		// TODO Auto-generated method stub
		List<Restaurant> restaurants = restaurantRepository.findAll();

		return restaurants;
	}
	
}
