package com.tinytong.springbootest.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Dota2RepositoryTest {
    @Autowired
    public Dota2Repository dota2Repository;
    UserRepositoryTest userRepositoryTest =new UserRepositoryTest();
    @Test
    void finAll(){
        System.out.println(dota2Repository.findAll());
    }
    @Test
    void TEST(){
        userRepositoryTest.findTest();
    }






}