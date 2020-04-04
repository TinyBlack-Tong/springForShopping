package com.tinytong.springbootest.repository;

import com.tinytong.springbootest.enity.Buyer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class userPhraseRepositoryTest {

    @Autowired
   private BuyerRepositoey buyerRepositoey;

    @Test
    void find(){
        System.out.println(buyerRepositoey.findAll());;
    }
}