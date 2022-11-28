package com.mindtree.Jenkinsdemo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldControllerTest {

	@Test
	public void heloTest() {
		HelloWorldController callHello = new HelloWorldController();
		assertEquals("Hello World!!", callHello.hello());

	}
}
