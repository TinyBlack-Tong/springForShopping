package com.tinytong.springbootest.controller;

import com.tinytong.springbootest.enity.User;
import com.tinytong.springbootest.repository.UserRepository;
//import jdk.nashorn.internal.objects.annotations.Getter;
//import org.graalvm.compiler.lir.LIRInstruction;
//import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserHandler {
    public static String whoisOn;
    private List<String> userID = new ArrayList<String>();
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/finall")
    public List<User> finAll() {
        return userRepository.findAll();
    }

    @PostMapping("/save")
        public String save(@RequestBody User user) {
        int lastIndex = userRepository.findAll().size();
        String PWD = user.getUser_password().toString();
        String PWD2 = user.getUser_password_2().toString();
        System.out.println("_________________");
        System.out.println(user.getUser_password_2());
        System.out.println(user.getUser_password());

        for (int i = 0; i < lastIndex; i++) {
            userID.add(userRepository.findAll().get(i).getUser_id());
        }
        if (userID.contains(user.getUser_id().toString()) == false
                && PWD.equals(PWD2)) {
            User userResult = new User();
            userResult.setUser_id(user.getUser_id().toString());
            userResult.setUser_password(user.getUser_password().toString());
//            userResult.setUser_password_2(user.getUser_password_2().toString());
            User user1 = userRepository.save(userResult);
            userID.add(user.getUser_id().toString());
            return "Yes";
        } else if (PWD.equals(PWD2) == false) {
            return "密码不一致";
        } else {
            return "No";
        }
    }

    @PostMapping("/check")
    public String Check(@RequestBody User user) {
        User user1 = userRepository.getOne(user.getUser_id());
        Optional<User> findResult = userRepository.findById(user.getUser_id());
//        int lastIndex = userRepository.findAll().size();
//        for (int i = 0; i < lastIndex; i++) {
//            userID.add(userRepository.findAll().get(i).getUser_id());
//        }
//
        try {
            if (findResult.get().getUser_password().equals(user.getUser_password())) {
                whoisOn=user.getUser_id();
                System.out.println("whoisOn："+whoisOn);
                return "Check Yes";

            }
        } catch (Exception e) {
            return "WDNMD";
        }
        if (findResult.get().getUser_password().equals(user.getUser_password()) == false) {
//            System.out.println(userID);
            return "Check No";
        }
        return "hha";
    }

    public String returnWhoisOn(){
        System.out.println("User测试："+whoisOn);
        return whoisOn;
    }

}
