package com.apoo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GeneralTestCase {

	public static void main(String[] args) {
	    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    
	    context.scan("com.apoo");
	    context.refresh();
		}

}
