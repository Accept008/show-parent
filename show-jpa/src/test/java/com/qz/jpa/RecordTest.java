package com.qz.jpa;

import com.alibaba.fastjson.JSON;
import com.qz.jpa.entity.RecordDo;
import com.qz.jpa.repository.RecordRepository;
import com.sun.prism.impl.Disposer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecordTest {
    @Autowired
    private RecordRepository recordRepository;

    @Test
    public void testMultiParam() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sdf.parse("2019-11-01 00:00:00");
//        Date end = sdf.parse("2019-11-30 00:00:00");// 2条
        Date end = sdf.parse("2019-12-30 00:00:00");// 3条
        List<RecordDo> records = recordRepository.findByRecordVersionAndStartBetween(1, start, end);
        records.forEach(record -> {
            System.out.println("record::"+record);
        });

        // 查询记录总数
        System.out.println("记录总数::"+recordRepository.countByRecordVersionAndStartBetween(1, start, end));

        // 分页查询
        Page<RecordDo> page = recordRepository.findByRecordVersionAndStartBetween(1, start, end, null);
        System.out.println("page::"+ JSON.toJSONString(page));
    }
}
