package com.flameling.mindef.telnet;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.apache.commons.net.telnet.TelnetClient;

public class Client {

	static final String SERVER_ADDRESS = "192.168.0.1";

	private TelnetClient apacheTelnetClient;

	public Client(TelnetClient apacheTelnetClient){
		this.apacheTelnetClient = apacheTelnetClient;
	}

	void connect(){
		try {
			apacheTelnetClient.connect(SERVER_ADDRESS);
		}catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
