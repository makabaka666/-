package com.zy.service.Impl;

import com.zy.dao.Impl.UserDaoImpl;
import com.zy.dao.UserDao;
import com.zy.pojo.User;
import com.zy.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public User selectOne(int u_id) {
        return userDao.selectOne(u_id);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int delete(int u_id) {
        return userDao.delete(u_id);
    }

    @Override
    public User insert(User user) {
        return userDao.insert(user);
    }
}
