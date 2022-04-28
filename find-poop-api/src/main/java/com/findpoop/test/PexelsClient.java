package com.findpoop.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "data", url = "${pexel.search.uri}")
public interface PexelsClient {
    // for fetching images page by page. refer https://www.pexels.com/api/documentation/
    @GetMapping
    PexelsRes getPhotos(@RequestParam("query") String query,
                  @RequestParam("per_page") int perPage,
                  @RequestParam("page") int page);

    // for fetching images for a topic. refer https://www.pexels.com/api/documentation/
    @GetMapping
    PexelsRes getPhotos(@RequestParam("per_page") int perPage,
                             @RequestParam("page") int page);



}

