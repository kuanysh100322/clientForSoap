package com.example.newclientsoap;

import generate.GetUsersResponse;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class NewClientSoapApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        UserClient client = context.getBean(UserClient.class);
        GetUsersResponse response = client.getUserByIin(new Long(12150499L));
        System.out.println("response: user iin="+ response.getUser().getIin()+", name=" + response.getUser().getName() + ", date="+ response.getUser().getDate());

    }
}
