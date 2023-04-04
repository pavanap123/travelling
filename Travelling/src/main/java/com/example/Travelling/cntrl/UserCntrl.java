package com.example.Travelling.cntrl;

import com.example.Travelling.Model.User;
import com.example.Travelling.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RequestMapping("api/v1")
@RestController
public class UserCntrl {

    @Autowired
    UserServiceImpl userService;
    @PostMapping("register")
    public ResponseEntity<Object> registration(@RequestBody User user) throws Exception {

        try {
            return new ResponseEntity<>(userService.adduser(user),HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
