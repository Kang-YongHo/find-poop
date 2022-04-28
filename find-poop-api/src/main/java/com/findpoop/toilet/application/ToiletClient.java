package com.findpoop.toilet.application;

import com.findpoop.toilet.application.request.ToiletRequests;
import com.findpoop.toilet.application.response.ToiletResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "toilet", url = "${toilet.api.uri}")
public interface ToiletClient {

    @GetMapping
    ToiletResponse getToilets(@RequestParam ToiletRequests toiletRequests);

    @GetMapping
    ToiletResponse getToilets(@RequestParam("serviceKey") String serviceKey,
                              @RequestParam("numOfRows") int numOfRows,
                              @RequestParam("type") String type);
}

