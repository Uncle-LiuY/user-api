package com.api.service.serviceimpl;

import com.api.pojo.User;
import com.api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserName() {
        User user = new User();
        user.setUid(1);
        user.setUname("张三");
        return user;
    }
}
