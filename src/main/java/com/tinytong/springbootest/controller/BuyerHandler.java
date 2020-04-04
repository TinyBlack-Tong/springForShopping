package com.tinytong.springbootest.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.tinytong.springbootest.enity.Buyer;
import com.tinytong.springbootest.enity.Dota2;
import com.tinytong.springbootest.enity.User;
import com.tinytong.springbootest.repository.BuyerRepositoey;
import com.tinytong.springbootest.repository.Dota2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/Buyer")
public class BuyerHandler {
    @Autowired
    private BuyerRepositoey buyerRepositoey;
    @Autowired
    private Dota2Repository dota2Repository;

    public  Double totalCost;
    @PostMapping("/BuyerCheck")
    String getMessage(@RequestBody Buyer buyer){
        String a;
        String b;
        Double price;
        int BuyNumber;
//        System.out.println(buyer.getBuy_Number());
//        return "m";
        //根据Dota2_id来进行价钱的查询

//        Buyer buyer1=buyerRepositoey.getOne(String.valueOf(buyer.getGoods_id()));
//        Optional<Buyer> findResult = buyerRepositoey.findById(String.valueOf(buyer.getGoods_id()));
//        try {
//            a= String.valueOf(findResult.get().getBuy_Number());
//            System.out.println(a);
//        }catch (Exception e){
//            return "e";
//        }

        //从buyer表中对应的id来查询dota2表中对应的DOTA2_id
        Dota2 dota2=dota2Repository.getOne(buyer.getGoods_id());
        Optional<Dota2> Dfind = dota2Repository.findById((buyer.getGoods_id()));
        b=Dfind.get().getName();
        price=Dfind.get().getPrice();
        BuyNumber=buyer.getBuy_Number();
        totalCost=price*BuyNumber;

        System.out.println("名称："+b);
        System.out.println("价钱："+price);
        System.out.println("价钱："+BuyNumber);
        System.out.println("花费:"+totalCost);
        return "me";
    }


}
