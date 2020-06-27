package com.lcss.spikegoodssystem.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Goods
 * @Description TODO
 * @Author xusisi
 * @Date 2020/6/27 下午5:30
 */
@Entity
@Table( name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name = "id", length = 20)
    private Long id;
    @Column
    private String orderId;
    @Column
    private Integer goodsNumber;
    @Column
    private Integer goodsId;
    @Column
    private Integer perPrice;
    @Column
    private Integer totalPrice;
    @Column
    private String states;
}
