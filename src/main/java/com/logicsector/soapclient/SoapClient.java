package com.logicsector.soapclient;

import java.net.SocketTimeoutException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.ws.soap.SOAPFaultException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.ConnectionType;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SoapClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(SoapClient.class);
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("EEEE, MMMM d yyyy");

	public static void main(String[] args) {
		try {
			LOGGER.debug("Creating weather service instance (Note: Weather = Service subclass)...");
			long start = new Date().getTime();
			// Get a reference to the SOAP service interface.

			//WebMISFeedService service = new WebMISFeedService();
			//WebMIS soap = service.getWebMISSoap11();
			//Client client = ClientProxy.getClient(soap);
			//HTTPConduit httpConduit = (HTTPConduit) client.getConduit();
			
			//HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
			//httpClientPolicy.setConnectionTimeout(15000);
			//httpClientPolicy.setReceiveTimeout(15000);
			//httpClientPolicy.setAllowChunking(false);
			//httpClientPolicy.setConnection(ConnectionType.KEEP_ALIVE);
			//httpConduit.setClient(httpClientPolicy);
	
			//long end = new Date().getTime();
			//LOGGER.debug("...Done! weatherService instance: {}", service);
			//LOGGER.debug("Time required to initialize weather service interface: {} seconds", (end - start) / 1000f);
			//LOGGER.debug("Soap instance: {}", soap);

			start = new Date().getTime();
			//AccountDetailsRequest request = new AccountDetailsRequest();
			//request.setAccountNumber("1");
			try {
				//AccountDetailsResponse accountDetails = soap.accountDetails(request);				
			} catch (SOAPFaultException e) {
				System.out.println(e);
			}
			//end = new Date().getTime();
			

			//LOGGER.debug("Time required to invoke 'accountDetails': {} seconds", (end - start) / 1000f);
			//LOGGER.debug("accountDetails: {}", accountDetails);
			//LOGGER.debug("AccountBalance city: {}", accountDetails.getAccountDetails().getAccountBalance());			
			LOGGER.debug("");
			
			LOGGER.debug("Program complete, exiting");
		} catch (Exception e) {
			LOGGER.error("An exception occurred, exiting", e);
		}
	}

}
