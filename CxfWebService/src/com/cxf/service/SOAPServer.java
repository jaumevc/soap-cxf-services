package com.cxf.service;
import javax.xml.ws.Endpoint;
import com.cxf.ifaces.*;

public class SOAPServer {

	public static void main(String[] args) {
		HelloWorldImpl implementor = new HelloWorldImpl();

		HelloWorldSEI f= new HelloWorldImpl();
		//direccio on publiquem el servei via web
		String address = "http://localhost:9000/HelloWorld";
		//indiquen al run time de javax a traves de cxf per a que 
		//publiqui un endpoint en la direccio indicada
		Endpoint.publish(address, implementor);
	}

}
