package com.zhou.jpa.service;

import com.zhou.jpa.domain.User;
import com.zhou.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author mac
 * @ClassName UserService
 * @Description
 * @Date 2019/11/30 5:46 下午
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public List<User> getUserListOrderId() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return userRepository.findUserOrderById(sort);
    }

    public List<User> findUserOrderByIdAndPage() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(0, 3, sort);
        return userRepository.findUserOrderByIdAndPage(pageable);
    }

    public List<User> findUserByPage() {
        Pageable pageable = PageRequest.of(0, 3);
        return userRepository.findUserByPage(pageable);
    }
}
