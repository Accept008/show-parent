package com.qz.jpa.repository;

import com.qz.jpa.entity.RecordDo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface RecordRepository extends JpaRepository<RecordDo, Integer> {

    List<RecordDo> findByRecordVersionAndStartBetween(Integer recordVersion, Date start, Date end);

    Long countByRecordVersionAndStartBetween(Integer recordVersion, Date start, Date end);

    Page<RecordDo> findByRecordVersionAndStartBetween(Integer recordVersion, Date start, Date end, Pageable pageable);
}
