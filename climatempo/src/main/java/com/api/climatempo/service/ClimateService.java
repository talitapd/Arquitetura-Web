
package com.api.climatempo.service;

import org.springframework.beans.factory.annotation.Value; 
import org.springframework.http.ResponseEntity; 
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException; 
import com.fasterxml.jackson.databind.JsonNode; 
import com.fasterxml.jackson.databind.ObjectMapper; 

@Service 
public class ClimateService {

    
    private String apiUrl =  "https://apiadvisor.climatempo.com.br/api/v1";


    @Value("${climatempo.api.key}") 
    private String apiKey;

    private final RestTemplate restTemplate; 
    private final ObjectMapper objectMapper; 

    public ClimateService() {
        this.restTemplate = new RestTemplate(); 
        this.objectMapper = new ObjectMapper(); 
    }

    public JsonNode getClimate(String country) {
        
        String url = String.format("%s/anl/synoptic/locale/%s?token=%s", apiUrl, country, apiKey);

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

       
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            try {
                
                return objectMapper.readTree(responseEntity.getBody());
            } catch (JsonProcessingException e) {
                
                return null;
            }
        } else {
            
            return null;
        }
    }

    public JsonNode getClimateRain(String id) {
        
        String url = String.format("%s/climate/temperature/locale/%s?token=%s", apiUrl, id, apiKey);
        
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

       
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            try {
                
                return objectMapper.readTree(responseEntity.getBody());
            } catch (JsonProcessingException e) {
               
                return null;
            }
        } else {
            
            return null;
        }
    }

}

