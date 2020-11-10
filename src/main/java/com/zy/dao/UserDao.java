package com.zy.dao;

import com.zy.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
    User selectOne(int u_id);
    int update(User user);
    int delete(int u_id);
    User insert(User user);
}
