package kr.co.fastcampus.eatgo.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fastcampus.eatgo.domain.Restaurant;

@RestController
public class RestaurantController {
	
	@GetMapping("/restaurant")
	public List<Restaurant> list(){
		List<Restaurant> restaurants = new ArrayList<>();
		
		Restaurant restaurant = new Restaurant(1004L, "Bob zip", "seoul");
		
		restaurants.add(restaurant);
		return restaurants;
	}
}
