package com.qz.jpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "t_record")
public class RecordDo {
    @Id
    private Integer recordId;

    @Column(name = "record_version")
    private Integer recordVersion;

//    @Column(name = "record_content")有时可省略
    private String recordContent;

    private Date start;

    private Date end;

    private String desp;

}
