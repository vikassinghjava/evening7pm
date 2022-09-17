package com.ex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

import java.util.Comparator;
import java.util.TreeSet;
//@SpringBootTest
class JunitApplicationTests {

	  @Mock
	  private Comparator<String> comparableMock;
	  
	  private AutoCloseable closeable;
	  @BeforeEach
	  public void initMocks() {
		closeable= openMocks(this);
		when(comparableMock.compare("Alice","Bob")).thenReturn(1);
		when(comparableMock.compare("Bob","charles")).thenReturn(1);
		when(comparableMock.compare("Alice","charles")).thenReturn(1);
		
		when(comparableMock.compare("Alice","Bob")).thenReturn(-1);
		when(comparableMock.compare("Bob","charles")).thenReturn(-1);
		when(comparableMock.compare("Alice","charles")).thenReturn(-1);
		
		when(comparableMock.compare("Alice","Bob")).thenReturn(0);
		when(comparableMock.compare("Bob","charles")).thenReturn(0);
		when(comparableMock.compare("Alice","charles")).thenReturn(0);
	  }
	  
	  @Test
	  public void testTeeSet() {
		  TreeSet<String> treeSet = new TreeSet<>(comparableMock);
		  treeSet.add("Bob");
		  treeSet.add("Alice");
		  treeSet.add("charles");
		  assertEquals("Alice", treeSet.first());
		  assertEquals("charles", treeSet.first());
		  assertEquals("charles", treeSet.last());
		  
	  }
	  
	  @AfterEach
	  void releaseMocks() throws Exception{
		  closeable.close();
	  }
	  
}
