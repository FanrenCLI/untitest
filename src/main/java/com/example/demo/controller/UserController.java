package com.example.demo.controller;

import com.example.demo.model.UserInfo;
import com.example.demo.model.UserInfoRequest;
import com.example.demo.model.UserInfoResponse;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：TODO
 * @Author：FanrenCLI
 * @Date:2021/12/8 19:23
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/userinfo")
    public UserInfoResponse getUserInfo(@RequestParam("userinfo") UserInfoRequest userInfoRequest){
        UserInfoResponse res = new UserInfoResponse();
        if (userInfoRequest==null||userInfoRequest.getUserId()==null){
            res.setRowCount(0);
            res.setRows(new ArrayList<>());
            return res;
        }
        List<UserInfo> result = userService.userInfoHandler(userInfoRequest);
        res.setRowCount(result.size());
        res.setRows(result);
        return res;
    }
}
