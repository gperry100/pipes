package com.ithis.functional.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class TestHarness extends FunctionalTestCase {
	
	@Override
	protected String getConfigFile() {
		// TODO Auto-generated method stub
		return "pipeline-experiments.xml";
	}
	
	@Test
	public void testMyStuff() throws Exception{
	    MuleClient client = new MuleClient(muleContext);
	    MuleMessage message = client.send("http://localhost:8081/test", "BOO", null);
	    
	    assertEquals("Hello BOO", message.getPayloadAsString());

	}
	
	

}
