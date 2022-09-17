package com.example.demo.testrestcontroller;

import org.h2.command.dml.MergeUsing.When;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.controller.MyController;
import com.example.demo.controller.service.WelcomeService;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@WebMvcTest(value=MyController.class)
public class WelcomeRestControllerTest {

		@MockBean	
		private WelcomeService welcomeService;
		
		@Autowired
		MockMvc mockMvc;
		
		@Test
		public void testWelcomeMessage() throws Exception {
			when(welcomeService.getWelcomeMessage()).thenReturn("Good morning!!!");
			 MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
			 ResultActions perform = mockMvc.perform(requestBuilder);
			 MvcResult result = perform.andReturn();
			 MockHttpServletResponse response = result.getResponse();
			 int status = response.getStatus();
			 assertEquals(200, status);
		}
		
		@Test
		public void testWelcomeMessage2() throws Exception {
			when(welcomeService.getWelcomeMessage()).thenReturn("Welcome message");
			 MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
			 ResultActions perform = mockMvc.perform(requestBuilder);
			 MvcResult result = perform.andReturn();
			 MockHttpServletResponse response = result.getResponse();
			 int status = response.getStatus();
			 assertNull(200, "");
		}
}
