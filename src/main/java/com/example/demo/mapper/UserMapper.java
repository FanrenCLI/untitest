package com.example.demo.mapper;

import com.example.demo.model.UserInfo;
import com.example.demo.model.UserInfoRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserInfo> userInfoQuery(@Param("req") UserInfoRequest req);

    List<UserInfo> userInfoLeaderQuery(UserInfoRequest req);

    Integer userInfoPartmentQuery(UserInfoRequest req);
}
