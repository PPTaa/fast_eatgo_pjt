package kr.co.fastcampus.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {
	
	
	
	private List<Restaurant> restaurants = new ArrayList<>();
	
	public RestaurantRepositoryImpl() {

		restaurants.add(new Restaurant(1004L, "Bob zip", "seoul"));
		restaurants.add(new Restaurant(2020L, "test food", "seoul"));
	}

	@Override
	public List<Restaurant> findAll() {
		
		return restaurants;
	}

	@Override
	public Restaurant findById(Long id) {

		return restaurants.stream()
				.filter(r -> r.getId().equals(id))
				.findFirst()
				.orElse(null);
	}

}
