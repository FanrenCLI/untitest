package com.example.demo.mapper;

import com.example.demo.model.UserInfo;
import com.example.demo.model.UserInfoRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserInfo> userInfoQuery(@Param("req") UserInfoRequest req);

    List<UserInfo> userInfoLeaderQuery(@Param("req") UserInfoRequest req);

    Integer userInfoPartmentQuery(@Param("req") UserInfoRequest req);
}
