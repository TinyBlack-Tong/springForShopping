package com.tinytong.springbootest.controller;

import com.tinytong.springbootest.enity.Dota2;
import com.tinytong.springbootest.repository.Dota2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.tinytong.springbootest.controller.UserHandler;
@RestController
@RequestMapping("/Dota2")
public class Dota2Handler {
    @Autowired
    private Dota2Repository dota2Repository;
    UserHandler userHandler=new UserHandler();

    @GetMapping("/Dota2Table")
    public List<Dota2> findAll(){
        System.out.println("Dota2 who is On："+userHandler.returnWhoisOn()   );
    return dota2Repository.findAll();
    }

    @PostMapping("/dota2Check")
    public String test(@RequestBody Dota2 dota2){
        System.out.println(dota2.getNumber());
        return "GetMessage";
    }

}
