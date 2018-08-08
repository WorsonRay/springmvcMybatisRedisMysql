package com.lwl.spring_redis.mapper;

import java.util.List;

import com.lwl.spring_redis.vo.User;

public interface UserMapper {

    public User selectByPrimaryKey(int userId);

    public List<User> selectAllUser();

    public void insertUser(User user);

    public void deleteUser(int id);

    public List<User> findUsers(String keyWords);

    public void editUser(User user);
}

