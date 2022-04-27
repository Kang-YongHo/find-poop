package com.findpoop.toilet.application;

import com.findpoop.toilet.application.response.ToiletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ToiletService {

    @Value("${toilet.api.key}")
    private String serviceKey;
    private final ToiletClient toiletClient;

    public ToiletResponse get(){
        return toiletClient.getToilets(serviceKey, 100, "json");
    }
}
