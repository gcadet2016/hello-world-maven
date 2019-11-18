package com.muk;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class HelloWorldApplicationTests extends AbstractTest {
	@Override
	@Before
	public void setUp() {
	   super.setUp();
	  }
	
	@Test
	public void testGetHello() throws Exception
	{
	    String uri = "/hello";
	    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	    	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
	    assertEquals(200, status);
	    String content = mvcResult.getResponse().getContentAsString();
	    assertEquals(content, "This is sample Hello World Update to test jenkins");
	}
	
	@Test
	public void testGreeting() throws Exception
	{
	    String uri = "/greet";
	    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	    	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
	    assertEquals(200, status);
	    String content = mvcResult.getResponse().getContentAsString();
	    assertEquals(content, "Greeting! Welcome to Spring-Boot Development!");
	}
}
