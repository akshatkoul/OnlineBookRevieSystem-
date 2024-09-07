package com.springboot.web.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;

@Service
public class EmployeeServices {
RestTemplate res = new RestTemplate();
public String loadAll(String name)
{
    String response = res.exchange("http://localhost:8090/loadAll/{name}",
    HttpMethod.GET,null,
            new ParameterizedTypeReference<String>(){
            },name).getBody();
            return response;
        }
       public String loadAllShuttle(String name)
       {
           String response12 = res.exchange("http://localhost:8070/loadAll/{name}",
                   HttpMethod.GET,
                   null,
                   new ParameterizedTypeReference<String>() {
                   },name).getBody();
           return response12;
       }
}
