package com.qz.jpa.service;

import com.qz.jpa.entity.DepartDo;
import com.qz.jpa.repository.DepartRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class DepartService {
    @Autowired
    private DepartRepository departRepository;

    public List<DepartDo> listDeparts(String departName){
        log.info("1.service::log::info");
        log.debug("2.service::log::debug");
        List<DepartDo> ds = departRepository.findByDepartName(departName);
        return ds;
    }
}
