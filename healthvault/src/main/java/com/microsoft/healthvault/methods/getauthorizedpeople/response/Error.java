package com.microsoft.healthvault.methods.getauthorizedpeople.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order( elements = {
		"message"
})
public class Error {

	@Element(required=true)
	private String message;
}
