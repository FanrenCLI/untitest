package com.example.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoResponse {
    private Integer rowCount;
    private List<UserInfo> rows;
    private  Integer errorNo;
    private String errorInfo;
}
