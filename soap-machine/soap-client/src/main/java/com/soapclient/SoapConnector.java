package com.soapclient;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapConnector extends WebServiceGatewaySupport {

	public Object soapConnect(String url, Object requestPayload) {
		
		return getWebServiceTemplate().marshalSendAndReceive(url, requestPayload);
	}
}
