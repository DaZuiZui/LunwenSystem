package com.demo.lw.entity;

import java.io.Serializable;

/**
 * (UmsUserRoleRelation)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:52:57
 */
public class UmsUserRoleRelation implements Serializable {
    private static final long serialVersionUID = 237639713203651949L;

    private Integer id;

    private Integer userId;

    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}

