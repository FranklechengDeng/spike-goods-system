package com.lcss.spikegoodssystem.Entity;

import lombok.*;

import javax.persistence.*;

/**
 * @ClassName Goods
 * @Description TODO
 * @Author xusisi
 * @Date 2020/6/27 下午5:30
 */
@Entity
@Table( name = "goods")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name = "id", length = 20)
    private Long id;
    @Column
    private String goodsId;
    @Column
    private Integer goodsNumber;
    @Column
    private Integer goodsPrice;
    @Column
    private String description;
    @Column
    private String goodsName;
}
