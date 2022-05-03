package com.television.coursework.controller;


import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

@RestController
public class SimpleController {

    @GetMapping("/print_something")
    ResponseEntity<?> print_something(){
        byte[] img= null;
        try {
            img = new FileInputStream("src/main/resources/photos/Снимок экрана (22).png").readAllBytes();
        } catch (IOException e) {
            return new ResponseEntity<String>( "Dead link",HttpStatus.BAD_REQUEST);
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setCacheControl(CacheControl.noCache().getHeaderValue());
        httpHeaders.setContentType(MediaType.IMAGE_PNG);
        httpHeaders.setContentLength(img.length);
        return new ResponseEntity<>(img,httpHeaders,HttpStatus.OK);
    }

}
