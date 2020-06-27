package com.lcss.spikegoodssystem.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName User
 * @Description TODO
 * @Author xusisi
 * @Date 2020/6/27 下午5:40
 */
@Entity
@Table( name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name = "id", length = 20)
    private Long id;
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private String gender;

}
