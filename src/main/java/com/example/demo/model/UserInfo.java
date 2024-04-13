package com.example.demo.model;

import lombok.Data;

@Data
public class UserInfo {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户性别
     */
    private String userSex;
    /**
     * 用户编码
     */
    private String userCode;
    /**
     * 用户联系方式
     */
    private String userLinkNo;
    /**
     * 登录日期
     */
    private Integer signInDate;
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
