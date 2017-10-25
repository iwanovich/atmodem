package com.flameling.mindef.telnet;

import org.apache.commons.net.telnet.TelnetClient;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.UnknownHostException;

public class ClientTest {

	private Client cut;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void connect() throws IOException {
		//setup
		TelnetClient apacheTelnetClientMock = Mockito.mock(TelnetClient.class);
		cut = new Client(apacheTelnetClientMock);
		//action
		cut.connect();
		//assert
		Mockito.verify(apacheTelnetClientMock, Mockito.times(1)).connect(Client.SERVER_ADDRESS);
	}

	@Test
	public void connectThrowsIOException() throws IOException{
		//setup
		TelnetClient apacheTelnetClientMock = Mockito.mock(TelnetClient.class);
		cut = new Client(apacheTelnetClientMock);
		Mockito.doThrow(IOException.class).when(apacheTelnetClientMock).connect(Mockito.anyString());
		//action
		cut.connect();
		//assert
		Mockito.verify(apacheTelnetClientMock, Mockito.times(1)).connect(Client.SERVER_ADDRESS);
	}

	@Test
	public void connectThrowsUnknownHostException() throws IOException{
		//setup
		TelnetClient apacheTelnetClientMock = Mockito.mock(TelnetClient.class);
		cut = new Client(apacheTelnetClientMock);
		Mockito.doThrow(UnknownHostException.class).when(apacheTelnetClientMock).connect(Mockito.anyString());
		//action
		cut.connect();
		//assert
		Mockito.verify(apacheTelnetClientMock, Mockito.times(1)).connect(Client.SERVER_ADDRESS);

	}

}
