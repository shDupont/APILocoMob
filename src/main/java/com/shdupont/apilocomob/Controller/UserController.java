package com.shdupont.apilocomob.Controller;

import com.shdupont.apilocomob.Model.User;
import com.shdupont.apilocomob.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id){
       try {
           User user = userService.getUser(id);
           return user;
       } catch (Exception e) {
           log.error(e.getMessage());
           return null;
       }
    }

    @PostMapping("/create")
    public void createUser(@RequestBody SignUpRequest signUpRequest){
        userService.createUser(signUpRequest);
    }
}
