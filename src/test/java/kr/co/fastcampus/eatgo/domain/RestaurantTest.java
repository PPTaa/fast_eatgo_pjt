package kr.co.fastcampus.eatgo.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class RestaurantTest {

	@SuppressWarnings("deprecation")
	@Test
	public void creation() {
		Restaurant restaurant = new Restaurant("Bob zip", "seoul");
		assertThat(restaurant.getName(), is("Bob zip"));
		assertThat(restaurant.getAddress(), is("seoul"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void information() {
		Restaurant restaurant = new Restaurant("Bob zip", "seoul");
		
		assertThat(restaurant.getInformation(), is("Bob zip in seoul"));
		
	}
	
}
