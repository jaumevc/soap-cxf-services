package com.cxf.ifaces;

public class HelloWorldImpl implements HelloWorldSEI {

	@Override
	public String helloWorld(String user) {
		return "Hello " +user;
	}

}
