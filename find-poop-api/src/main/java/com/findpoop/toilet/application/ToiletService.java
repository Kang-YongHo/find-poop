package com.findpoop.toilet.application;

import com.findpoop.toilet.application.request.ToiletRequests;
import com.findpoop.toilet.application.response.ToiletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.SocketTimeoutException;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ToiletService {

    @Value("${toilet.api.key}")
    private String serviceKey;
    private final ToiletClient toiletClient;

    public ToiletResponse get(ToiletRequests req){
        req.setServiceKey(serviceKey);
//        return toiletClient.getToilets(req);
        return toiletClient.getToilets(serviceKey, 100, "json");
    }
}
