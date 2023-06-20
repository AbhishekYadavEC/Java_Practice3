package controller;

import model.User;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@RequestMapping("/rest")
@RestController
public class SpringRestController {
    /*@RequestMapping("restMessage")
    public  @ResponseBody User sayHello(){
        User user=new User(101,"alex");
        return user;
    }
    @PutMapping(value = "/printUser")
    public  @ResponseBody String showUser(@RequestBody User user){
        *//*User user=new User();
        user.setUserId(101);
        user.setUserName("Eugene");*//*
        // logic to validate user
        return user.getUserId() + " is valid";
    }
    @RequestMapping(value = "showAllUsers")
    public @ResponseBody
    List<User> showAll(){
        List<String> preferLocList=new ArrayList<> ();
        preferLocList.add("Delhi");
        preferLocList.add("noida");
        LocalDate dob=LocalDate.of(1995,04,20);
        List<User> userList=new ArrayList<>();
        userList.add(new User(101,"Yash",preferLocList,dob));
        userList.add(new User(102,"Suryakant",preferLocList,dob));
        userList.add(new User(103,"Deepak",preferLocList,dob));
        userList.add(new User(104,"shaquib",preferLocList,dob));
        return userList;
    }*/
}