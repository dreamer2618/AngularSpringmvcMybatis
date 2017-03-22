package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import com.yb.entity.User;
import com.yb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/users")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/userlist.json")
    public @ResponseBody List<User> getUserList() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/addUser/{userName}", method = RequestMethod.POST)
    public @ResponseBody void addUser(@PathVariable("userName") String userName) {
    	userService.addUser(userName);
    }

    @RequestMapping(value = "/removeUser/{userName}", method = RequestMethod.DELETE)
    public @ResponseBody void removeUser(@PathVariable("userName") String userName) {
    	userService.deleteUser(userName);
    }

    @RequestMapping(value = "/removeAllUsers", method = RequestMethod.DELETE)
    public @ResponseBody void removeAllUsers() {
    	userService.deleteAll();
    }

    @RequestMapping("/layout")
    public String getUserPartialPage() {
        return "users/layout";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam String userName,@RequestParam String password){

	    return "sucess";
    }
	
}
