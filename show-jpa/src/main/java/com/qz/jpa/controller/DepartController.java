package com.qz.jpa.controller;

import com.alibaba.fastjson.JSON;
import com.qz.jpa.entity.DepartDo;
import com.qz.jpa.repository.DepartRepository;
import com.qz.jpa.service.DepartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class DepartController {
    @Autowired
    private DepartService departService;

    // 使用时，需要在Edit Configurations 的 Environment Variables配置（查看application.yml）
//    @Value("${ABC}")
    private Integer serverPort = 8090;

    @RequestMapping(value = "depart/list")
    public List<DepartDo> listDepart(){
        log.info("1.controller::log::info");
        log.debug("2.controller::log::debug::输出::");
        List<DepartDo> ds = departService.listDeparts("xm");
        System.out.println("optTime::【"+new Date() + "】");
        System.out.println("departs::"+ JSON.toJSONString(ds));
        return ds;
    }

    @RequestMapping(value = "port")
    public Integer getServerPort(){
        return serverPort;
    }

    @RequestMapping(value = "log")
    public List<String> abc(){
        String infoMsg = "info message print";
        String debugMsg = "debug message print";
        log.debug("debug::console print::"+debugMsg);
        log.info("info::console print::"+infoMsg);
        return Arrays.asList(infoMsg, debugMsg);
    }
}
