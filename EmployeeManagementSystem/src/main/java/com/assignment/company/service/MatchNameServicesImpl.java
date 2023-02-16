package com.assignment.company.service;

import com.assignment.company.model.RequestMatchName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MatchNameServicesImpl implements MatchNameServices{

    @Value("${api.url}")
    private String url;
    @Override
    public Object matchName(RequestMatchName requestMatchName) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.add("content-type","application/json");
        httpHeaders.add("loginId","shahan.alam@decimal.co.in");
        httpHeaders.add("orgid","TRAINING-2022-HWA25D5SDG");
        httpHeaders.add("appid","GROUP-1-MIODZ9PNVQ");
        httpHeaders.add("requestid","54321687667890");
      //  httpHeaders.add("security-version","2");
     //   httpHeaders.add("securitylevel","X");
        httpHeaders.add("clientsecret","71fdd47c-974b-4af1-a398-2f9933894532");
        httpHeaders.add("servicename","NAME_MATCH");

        HttpEntity<Object> entity = new HttpEntity<>(requestMatchName,httpHeaders);

        ResponseEntity<RequestMatchName> responseObj = restTemplate.exchange(url, HttpMethod.POST,entity,RequestMatchName.class);
        RequestMatchName resObj = responseObj.getBody();

        Object result = restTemplate.getForObject(url,String.class,entity);
        return resObj;
    }

}
