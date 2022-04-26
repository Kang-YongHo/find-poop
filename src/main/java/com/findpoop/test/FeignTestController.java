package com.findpoop.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignTestController {

    @Autowired
    private ImageService imageService; // instance of PexelImageService

    //Quote's endpoint


    // Endpoint for fetching images
    @GetMapping("/images")
    public List<Image> getImages(@RequestParam("topic") String topic
            , @RequestParam(value= "page", required = false, defaultValue = "0") int page) {
        if(topic == null || topic.trim().length() == 0) {
            return imageService.getImages(page);
        }
        return imageService.getImages(topic, page);
    }
}
