package com.cxf.ifaces;

import javax.jws.WebService;

@WebService
public interface HelloWorldSEI {
	public String helloWorld(String user);
}
