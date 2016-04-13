package com.ithis;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class GreeterComponent implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		String payload = eventContext.getMessage().getPayloadAsString();
		
		return "Hello hh" + payload;
	}

}
