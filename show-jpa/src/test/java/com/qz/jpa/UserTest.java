package com.qz.jpa;

import com.qz.jpa.entity.UserDo;
import com.qz.jpa.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserRepository userRepository;

    /*+++++++++++++++++++++++++>>【1.JPA自带方法】<<+++++++++++++++++++++++++*/
    @Test
    public void testFindOne(){
        UserDo user = userRepository.findOne(2);
        System.out.println("user::"+user);
    }
    @Test
    public void testFindAll(){
        // a.所有记录
        List<UserDo> users = userRepository.findAll();
        users.forEach(user -> {
            System.out.println("user::"+user);
        });
    }

    /*+++++++++++++++++++++++++>>【2.自定义方法】<<+++++++++++++++++++++++++*/
    @Test
    public void testFindBy(){
//        Optional<UserDo> optionalUserDo=userRepository.findById(1);
//        if(optionalUserDo.isPresent()){
//            UserDo userDo=optionalUserDo.get();
//            System.out.println("testFind user:: "+userDo);
//        }
        UserDo user = userRepository.findByUserName("manistal");
        System.out.println("testFind user:: "+user);
    }

    /**
     * 初始化一个对象 UserDO 测试Insert过程
     * */
//    @Before
//    public void before(){
//        UserDo userDo=new UserDo();
//        userDo.setId(1);
//        userDo.setUserName("fishpro");
//        userDo.setSex(1);
//        userDo.setLastLoginTime(new Date());
//        userDo.setPassword("passWord");
//        userRepository.save(userDo);
//    }
}
