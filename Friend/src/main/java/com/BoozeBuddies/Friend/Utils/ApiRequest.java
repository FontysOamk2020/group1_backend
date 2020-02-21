package com.BoozeBuddies.Friend.Utils;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class ApiRequest {
    public static Object CreateGetRequest(String url, Object returnObject)
    {
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity;
        entity = new HttpEntity<>(headers);


        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.GET, entity, returnObject.getClass());

        return response.getBody();
    }
}
