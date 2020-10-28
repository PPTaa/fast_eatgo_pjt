package kr.co.fastcampus.eatgo.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fastcampus.eatgo.application.RestaurantService;
import kr.co.fastcampus.eatgo.domain.MenuItem;
import kr.co.fastcampus.eatgo.domain.MenuItemRepository;
import kr.co.fastcampus.eatgo.domain.Restaurant;
import kr.co.fastcampus.eatgo.domain.RestaurantRepository;

@RestController
public class RestaurantController {
	
//	@Autowired
//	private RestaurantRepository restaurantRepository;
//	@Autowired
//	private MenuItemRepositroy menuItemRepositroy;
	@Autowired
	private RestaurantService restaurantService;

	@GetMapping("/restaurant")
	public List<Restaurant> list(){
		
		List<Restaurant> restaurants = restaurantService.getRestaurants();
		return restaurants;
	}
	
	@GetMapping("restaurant/{id}")
	public Restaurant detail(@PathVariable("id") Long id) {
		
		Restaurant restaurant = restaurantService.getRestaurant(id);
		
//		Restaurant restaurant = restaurantRepository.findById(id);
		
//		List<MenuItem> menuitems = menuItemRepositroy.findAllByRestaurantId(id);
//		restaurant.setMenuItems(menuitems);
		
		return restaurant;
	}
}
