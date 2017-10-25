package com.flameling.mindef.telnet;

import org.apache.commons.net.telnet.TelnetClient;

public class Main {

	public static void main(String[] args){
		System.out.println("Hello World!");
		Client client = new Client(new TelnetClient());
		client.connect();
	}

}
