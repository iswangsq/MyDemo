package com.test.mapper;

import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    public List<User> select01();

    public Map<String, Integer> queryRange();

    public List<User> inserUser();

    public List<User> selectUser();

    public List<User> queryOne(Integer id);

    public List<User> updateOne();

}
