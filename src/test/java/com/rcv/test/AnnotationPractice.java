package com.rcv.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationPractice {

	@BeforeEach
    public void setUp() {
		  System.out.println("Open browser");
	}
	
	 @Test
	    public void loginTest() {
	        System.out.println("Execute login test");
	    }
	 @Test
	    public void searchTest() {
	        System.out.println("Execute search test");
	    }
	 

}
