package com.tinytong.springbootest.enity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
public class Dota2 {
    @Id
    private int Dota2_id;

    public int getDota2_id() {
        return Dota2_id;
    }

    public void setDota2_id(int dota2_id) {
        Dota2_id = dota2_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private String name;
    private Double price;
    private int number;




}
