package com.example.authenticationserver.Controller;

import com.example.authenticationserver.Filter.JwtCheckFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final JwtCheckFilter checkFilter;


    @GetMapping("/user/authentication-api")
    public String AuthenticationCall(HttpServletRequest request, HttpServletResponse response){
        String user = checkFilter.jwtCheckUser(request, response);
        return user;
    }
}