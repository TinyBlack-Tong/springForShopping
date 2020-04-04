package com.tinytong.springbootest.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BuyerRepositoeyTest {
    @Autowired
    private BuyerRepositoey buyerRepositoey;

    @Autowired
     Dota2Repository dota2Repository;

    @Test
    void findall(){
        System.out.println(dota2Repository.findAll());
    }
}