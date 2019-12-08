package com.qz.jpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_depart")
public class DepartDo {
    @Id
    private String departId;

    @Column(name = "depart_name")
    private String departName;

    @Column(name = "remark")
    private String remark;
}
