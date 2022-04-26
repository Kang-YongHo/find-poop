package com.findpoop.test;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PexelRequestInterceptor implements RequestInterceptor {

    @Value("${pexel.api.key}")
    private String apiKey; // will fetch pexel's api key from Applictaion.properties
    private static final String AUTHORIZATION = "Authorization";


    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header(AUTHORIZATION, apiKey);
        //required as Pexel expect requests from a browser
        requestTemplate.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 " +
                "(KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
    }
}
