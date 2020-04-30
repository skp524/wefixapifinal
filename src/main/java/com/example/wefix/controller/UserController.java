package com.example.wefix.controller;
import com.example.wefix.model.OrderHSRequest;
import com.example.wefix.model.OrderITMRequest;
import com.example.wefix.model.User;
import com.example.wefix.service.UserService;
import com.example.wefix.views.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public User validateLogin(@RequestBody LoginRequest loginRequest)
    {
        return userService.validateLogin(loginRequest);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/signUp")
    public void addUser(@RequestBody User user)
    {

        userService.addUser(user);
    }

    @GetMapping("/users/{id}")
    public List<User> getUsersById(@PathVariable int id)
    {
        return userService.getUsersById(id);
    }
    @GetMapping("/users")
    public List<User> getUsers()
    {
        return userService.getUsers();
    }



    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id)
    {
        userService.deleteUser(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/ordersHS")
    public void addHSOrder(@RequestBody OrderHSRequest orderHSRequest)
    {

        userService.addHSOrder(orderHSRequest);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/ordersITM")
    public void addITMOrder(@RequestBody OrderITMRequest orderITMRequest)
    {

        userService.addITMOrder(orderITMRequest);
    }
}
