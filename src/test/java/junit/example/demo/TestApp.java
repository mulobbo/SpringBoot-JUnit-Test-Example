package junit.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@AutoConfigureMockMvc
public class TestApp extends JunitExampleApplicationTests {

	@Autowired WebApplicationContext webApplicationContext;
	
	@Autowired MockMvc mockMvc;
	

	

	
	
	@org.junit.jupiter.api.Test
	public void testProduct() throws Exception{
		
		mockMvc.perform(get("/products")).andExpect(status().isOk())
		.andExpect(content().contentType("application/json"))
		.andExpect(jsonPath("$.prodId").value(1)).andExpect(jsonPath("$.name").value("kalem"))
		.andExpect(jsonPath("$.stock").value(140));
		
		
	}
	
}
