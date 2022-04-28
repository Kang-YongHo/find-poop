package com.findpoop.toilet.controller;

import com.findpoop.toilet.application.ToiletService;
import com.findpoop.toilet.application.request.ToiletRequests;
import com.findpoop.toilet.application.response.ToiletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ToiletController {

    private final ToiletService toiletService;

    @GetMapping("/toilets")
    public ResponseEntity<ToiletResponse> toilets(ToiletRequests req){
        ToiletResponse response = toiletService.get(req);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }
}
