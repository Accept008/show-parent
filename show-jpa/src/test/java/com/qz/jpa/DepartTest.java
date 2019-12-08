package com.qz.jpa;

import com.qz.jpa.entity.DepartDo;
import com.qz.jpa.repository.DepartRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartTest {
    @Autowired
    private DepartRepository departRepository;

    /*+++++++++++++++++++++++++>>【1.JPA自带方法】<<+++++++++++++++++++++++++*/
    @Test
    public void testFindOne(){
        DepartDo departDo = departRepository.findOne("D001");
        System.out.println("departDo::" + departDo);
    }

    @Test
    public void testOther(){
//        System.out.println("a.表记录总数::"+departRepository.count());
//        System.out.println("b.根据主键删除::"); departRepository.delete("3");
//        System.out.println("c.根据主键判断是否存在::"+departRepository.exists("D002"));
        System.out.println("d.多条件查询::"+departRepository.findByDepartNameAndRemark("xm", "4561"));
    }

    /*+++++++++++++++++++++++++>>【2.自定义方法】<<+++++++++++++++++++++++++*/
    @Test
    public void testFindBy(){
//        DepartDo departDo = departRepository.findByDepartName("xm");
//        System.out.println("departDo::" + departDo);
        List<DepartDo> ds = departRepository.findByDepartName("xm");
        ds.forEach(d -> System.out.println("ds::" + ds));
    }
}
