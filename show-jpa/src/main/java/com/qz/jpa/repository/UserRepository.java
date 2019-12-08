package com.qz.jpa.repository;

import com.qz.jpa.entity.UserDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//@NoRepositoryBean
public interface UserRepository extends JpaRepository<UserDo,Integer> {
    Optional<UserDo> findById(int i);

    UserDo findByUserName(String userName);


}
