package com.demo.lw.entity;

import java.io.Serializable;

/**
 * (UmsUserPermissionRelation)实体类
 *
 * @author 1
 * @since 2024-05-13 13:51:27
 */
public class UmsUserPermissionRelation implements Serializable {
    private static final long serialVersionUID = -28471130289106445L;

    private Integer id;

    private Integer userId;

    private Integer permissionId;

    private String type;


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

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

