package com.television.coursework.controller;


import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
public class PublishController {

//    @GetMapping("/publish/{userid}")
//    public ResponseEntity<?>Publish(){byte[] img=null;
//        try {
//            img =new FileInputStream("src/main/resources/photos/Снимок экрана (22).png").readAllBytes();
//        } catch (IOException e) {
//            return new ResponseEntity<String>( "Dead link", HttpStatus.BAD_REQUEST);
//        }
//        if(user.getState()==true){
//            HttpHeaders httpHeaders = new HttpHeaders();
//            httpHeaders.setCacheControl(CacheControl.noCache().getHeaderValue());
//            httpHeaders.setContentType(MediaType.IMAGE_PNG);
//            httpHeaders.setContentLength(img.length);
//            return new ResponseEntity<>(img, HttpStatus.OK);
//    }
//        return new ResponseEntity<String>( "No synchronized users", HttpStatus.BAD_REQUEST);
//    }
}

