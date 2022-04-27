package com.findpoop.toilet.controller;

import com.findpoop.toilet.service.ToiletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ToiletController {

    private final ToiletService toiletService;

    @GetMapping("/toilets")
    public ResponseEntity<Map> toilets(){
        Map map = toiletService.get();
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }
}
