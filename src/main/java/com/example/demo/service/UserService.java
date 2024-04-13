package com.example.demo.service;

import com.example.demo.model.UserInfo;
import com.example.demo.model.UserInfoRequest;

import java.util.List;

public interface UserService {
    List<UserInfo> userInfoHandler(UserInfoRequest userInfoRequest);
}
