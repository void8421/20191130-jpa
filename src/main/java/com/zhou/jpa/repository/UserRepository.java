package com.zhou.jpa.repository;

import com.zhou.jpa.domain.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author mac
 * @ClassName UserRepository
 * @Description
 * @Date 2019/11/30 5:46 下午
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u")
    public List<User> findUserOrderById(Sort sort);

    @Query("select u from User u")
    public List<User> findUserOrderByIdAndPage(Pageable pageable);

    @Query("select u from User u")
    public List<User> findUserByPage(Pageable pageable);
}
