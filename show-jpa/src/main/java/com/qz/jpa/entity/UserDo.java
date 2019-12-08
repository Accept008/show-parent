package com.qz.jpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 用户实体类
 * */
@Data
@Entity
@Table(name="t_user")
public class UserDo {
    @Id
    private Integer id;
    @Column(name = "user_name", length = 200)
    private String userName;
    @Column(name = "password", length = 200)
    private String password;
    @Column(name = "sex")
    private Integer sex;
    @Column(name = "last_login_time")
    private Date lastLoginTime;
}
