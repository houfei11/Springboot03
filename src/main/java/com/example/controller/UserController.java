package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据处理层
 *
 * @author Administrator
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User getId(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public int addUser(User user) {
        int returnUser = userService.addUser(user);
        return returnUser;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String delUser(@PathVariable("id") int id) {
        int delUser = userService.delUser(id);
        if (delUser == 0){
            return "删除失败";
        }
        return "删除成功";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(User user) {
        int updateUser = userService.updateUser(user);
        if (updateUser == 0){
            return "修改失败";
        }
        return "修改成功！！";
    }
}
