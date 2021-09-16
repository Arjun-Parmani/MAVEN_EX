//package com.lti.junitdemo;
//
//
//
//import java.util.ArrayList;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import com.lti.demo.Calculator;
//import com.lti.demo.MyApp;
//
//class MyAppTest {
//
////	@Test
////	void test() {
////		fail("Not yet implemented");
////	}
//	@Test
//	void testShow() {
//		MyApp n = new MyApp();
//		String s = n.show();
//		Assertions.assertEquals("hello Maven",s);
//		
//		
//	}
//	@Test
//	void testAdd() {
//		int r=Calculator.add(10, 20);
//		Assertions.assertEquals(30,r);
//		Assertions.assertEquals(30,Calculator.add(10, 20),"Testing Method");
//		Assertions.assertNotEquals(130,r);
//		
//	}
//	
//	@Test
//	void testAssertFalse() {
//		Assertions.assertFalse("Ramos".length()==4);
//		Assertions.assertFalse(10>20,"Comparing two values");
//		
//	}
//	@Test
//	void testAssertNull() {
//		String s1=null;
//		String s2="abc";
//		Assertions.assertNull(s1);
//		Assertions.assertNotNull(s2);
//		
//	}
//	@Test
//	void testAssertAll() {
//		String s1="xyz";
//		String s2="abc";
//		
//		Assertions.assertAll(
//				() -> Assertions.assertEquals(s1, "xyz"),
//				() -> Assertions.assertEquals(s2, "abc")
//				
//				);
//		
//	}
//	
//	@Test
//	void testCollections() {
//		
//		ArrayList<String> myList= new ArrayList<>();
//		myList.add("Hello");
//		Assertions.assertFalse(myList.isEmpty());
//				
//		
//	}
//	
//	
//  }
//
//
//  
