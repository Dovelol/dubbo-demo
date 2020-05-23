package com.dovelol.dubboprovider.entity;

import java.io.Serializable;

/**
 * @author Dovelol
 * @date 2020/5/23 22:40
 */
public class Order implements Serializable {

    private Long                id;

    private Long                userId;

    private Long                goodsId;

    private String              goodsName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                '}';
    }
}
