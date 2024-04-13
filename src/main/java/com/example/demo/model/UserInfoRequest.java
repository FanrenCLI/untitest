package com.example.demo.model;

import lombok.Data;

@Data
public class UserInfoRequest {
    private String errorInfo;
    private Integer errorNo;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户编码
     */
    private String userCode;
    /**
     * 用户标签
     */
    private String userTag;
    /**
     * 用户上级
     */
    private Integer leaderNo;
    /**
     * 部门ID
     */
    private Integer partId;
    /**
     * 部门名称
     */
    private String partName;
}
