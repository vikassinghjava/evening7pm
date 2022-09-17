package com.example.demo.testrestcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.controller.BookRestController;
import com.example.demo.controller.entity.Book;
import com.example.demo.controller.service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

@WebMvcTest(value=BookRestController.class)
public class BookRestControllerTest {
		
	@MockBean
	private BookService bookService;
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
 	public void testBook() throws Exception {
 				when(bookService.saveBook(ArgumentMatchers.any())).thenReturn(true);
 				
 			Book book=new Book(101,"java head first",405.00);	
 			ObjectMapper mapper=new ObjectMapper();
 			String stringJson = mapper.writeValueAsString(book);
 			
			 ResultActions perform = mockMvc.perform(MockMvcRequestBuilders.post("/addBook")
					.contentType(MediaType.APPLICATION_JSON)
					.content(stringJson));
			
			int status=perform.andReturn().getResponse().getStatus();
			assertEquals(201, status);
	}
	
	@Test
 	public void testBook2() throws Exception {
 				when(bookService.saveBook(ArgumentMatchers.any())).thenReturn(false);
 				
 			Book book=new Book(101,"java head first",405.00);	
 			ObjectMapper mapper=new ObjectMapper();
 			String stringJson = mapper.writeValueAsString(book);
 			
			 ResultActions perform = mockMvc.perform(MockMvcRequestBuilders.post("/addBook")
					.contentType(MediaType.APPLICATION_JSON)
					.content(stringJson));
			
			int status=perform.andReturn().getResponse().getStatus();
			assertEquals(400, status);
	}
}
