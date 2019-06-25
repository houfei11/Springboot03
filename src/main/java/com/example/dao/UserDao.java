package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
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
    int deleteUser(int id);

    /**
     * 修改
     * @param user
     * @return
     */
    int updateUser(User user);
}
