package com.example.service;

import com.example.entity.User;

public interface UserService {
    /**
     * 查询
     * @param id
     * @return
     */
    User getUser(int id);

    /**
     * 新增
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 删除
     * @param id
     * @return
     */
    int delUser(int id);

    int updateUser(User user);
}
