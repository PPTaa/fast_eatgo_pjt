package kr.co.fastcampus.eatgo.interfaces;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(RestaurantController.class)
public class RestaurantControllerTest {
	
	@Autowired
	private MockMvc mvc;

	@Test
	public void list() throws Exception {
		mvc.perform(get("/restaurant"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("\"name\":\"Bob zip\"")))
				.andExpect(content().string(containsString("\"id\":1004")));
		
	}
}
