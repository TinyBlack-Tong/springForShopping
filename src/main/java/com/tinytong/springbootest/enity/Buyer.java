package com.tinytong.springbootest.enity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Buyer {
    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    @Id
    private String buyer_id;
    private int goods_id;

    public int getBuy_Number() {
        return buy_Number;
    }

    public void setBuy_Number(int buy_Number) {
        this.buy_Number = buy_Number;
    }

    private int buy_Number;


}
