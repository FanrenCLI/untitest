package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserInfo;
import com.example.demo.model.UserInfoRequest;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    private Integer checkoutUserExist(UserInfoRequest req) {
        List<UserInfo> userInfoList = userMapper.userInfoLeaderQuery(req);
        if (CollectionUtils.isEmpty(userInfoList)){
            return 1;
        }
        Integer count = userMapper.userInfoPartmentQuery(req);
        if (count==null||count==0){
            return 1;
        }
        return 1;
    }

    @Override
    public List<UserInfo> userInfoHandler(UserInfoRequest userInfoRequest) {
        List<UserInfo> result = new ArrayList<>();
        Integer count = checkoutUserExist(userInfoRequest);
        if (count==null||count==0){
            return new ArrayList<>();
        }
        if (userInfoRequest.getUserId()==1){
            userInfoRequest.setUserName("2");
        } else if (userInfoRequest.getUserId()==2) {
            userInfoRequest.setUserName("4");
        }else{
            userInfoRequest.setUserName("3");
        }
        if (userInfoRequest.getPartId()==1){
            userInfoRequest.setPartName("aaa");
        }else{
            userInfoRequest.setPartName("bbb");
        }
        List<UserInfo> userInfoList = userMapper.userInfoQuery(userInfoRequest);
        for (UserInfo userInfo : userInfoList) {
            boolean flag1=false;
            boolean flag2=false;
            if (userInfo.getUserSex().equals("1")){
                flag1 = true;
            }
            if (userInfo.getUserTag().equals("1,2")){
                flag2 = true;
            }
            if (flag1&&flag2){
                result.add(userInfo);
            }else{
                userInfo.setPartId(-1);
                result.add(userInfo);
            }
        }
        return result;
    }
}
