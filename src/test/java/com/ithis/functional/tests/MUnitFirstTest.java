package com.ithis.functional.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mule.api.MuleEvent;
import org.mule.munit.runner.functional.FunctionalMunitSuite;

public class MUnitFirstTest extends FunctionalMunitSuite {
	
	@Override
	protected String getConfigResources() {
		return "pipeline-experiments.xml";
	}
	
	@Test
	public void testMyStuff() throws Exception{
	    MuleEvent result = runFlow("pipeline-experimentsFlow", testEvent("blah")); 
	    assertEquals("Hello blah", result.getMessage().getPayloadAsString());

	}

}
