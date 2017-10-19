package com.flameling.mindef.telnet;

import static org.junit.Assert.*;

import org.apache.commons.net.telnet.TelnetClient;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

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
		TelnetClient apacheTcMock = Mockito.mock(TelnetClient.class);
		//cut = new Client();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void connect() {
		//fail("Not yet implemented");

		//boolean success = cut.connect();

		//assertTrue(success);
	}

}
