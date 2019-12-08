package com.qz.jpa.repository;

import com.qz.jpa.entity.DepartDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface DepartRepository extends JpaRepository<DepartDo, String> {

    //DepartDo findByDepartName(String name);
    List<DepartDo> findByDepartName(String departName);

    DepartDo findByDepartNameAndRemark(String departName, String remark);

    // Pageable
}
