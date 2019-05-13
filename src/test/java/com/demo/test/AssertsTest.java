package com.demo.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import com.demo.entity.Location;
import com.demo.entity.Movie;
import com.demo.entity.User;


public class AssertsTest {

	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Test
	public void basicAssertsTests(){
		LocalDateTime today = LocalDateTime.now();
		
		assertTrue("Error comparison",today.isAfter(today.minusHours(1L))); // never use !true, in this case use assertFalse
		assertFalse("Error comparison", today.isBefore(today));

		assertEquals("2", "2");
		assertEquals(0.345654, 0.453,0.001); /***
		 the 0.001 is the reference of decimals to be used in the two parameters ***/ 
	
		assertEquals(Math.PI,0.345,0.0001); //false
	
		//Review
		int i = Integer.valueOf(3); //unboxing
		Integer i2 = i; //autoboxing
		
		assertEquals(i,i2.intValue()); // cannot use type Primitive and Wrapper
		//Or
		
		//(<value expected>, <value received>)
		assertEquals(Integer.valueOf(i), i2);
		
		//String
		
		assertTrue("java".equalsIgnoreCase("Java"));
		assertNotEquals("java", "Java");
		
		//Objects
		User user1 = new User("User1");
		User user2 = new User("User1"); 
		User user3 = user2;
		User user4 = null;
		
		/**Important! -> If has not method equals in the object class,
		 * then the compiler will consider the equals from the superClass
		 * Object, that will refer the object instance, not the his value**/
		assertEquals(user1, user2); //if has not equals in User , then is false
	
		//if object instance are same
		assertSame(user2,user3); 
		assertNotSame(user1, user2);
	
		//if object is null
		assertNull(user4);
		assertNotNull(user1);
	
		Movie movie = new Movie("The Avengers","Marvel",LocalDate.of(2012,04,27),100,29.9);
		Location location = new Location(user1, movie , LocalDate.now(), LocalDate.now().plusDays(15L), 29.9);
		
		//Using type of Assert with readable code, but can be a lot of code by using it
		// (<value received, value expected (using CoreMatchers)>)
		assertThat(location.getTotalValue(), equalTo(29.99));
		assertThat(user2, is(equalTo(user3)));
	
		//Using type of Assert without stopping when encounter an error
		error.checkThat(location.getTotalValue(), equalTo(39.99));
		error.checkThat(user1, is(equalTo(user3)));
;
	}
}
