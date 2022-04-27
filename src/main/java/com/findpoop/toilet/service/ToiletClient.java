package com.findpoop.toilet.service;

import com.findpoop.test.PexelsRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "toilet", url = "${toilet.api.uri}")
public interface ToiletClient {

    @GetMapping
    Map getToilets(@RequestParam("serviceKey") String serviceKey,
                  @RequestParam("numOfRows") int numOfRows,
                  @RequestParam("type") String type);
}
