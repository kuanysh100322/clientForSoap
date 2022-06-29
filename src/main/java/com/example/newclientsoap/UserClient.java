package com.example.newclientsoap;

import generate.GetUsersRequest;
import generate.GetUsersResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class UserClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(UserClient.class);

    public GetUsersResponse getUserByIin(Long iin){
        GetUsersRequest request = new GetUsersRequest();
        request.setIin(iin);

        log.info("Requesting user By IIN= " + iin);
        return (GetUsersResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
