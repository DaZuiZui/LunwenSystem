package com.demo.lw.entity;

import java.io.Serializable;

/**
 * (UmsRolePermissionRelation)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:30:47
 */
public class UmsRolePermissionRelation implements Serializable {
    private static final long serialVersionUID = 504442352299198149L;

    private Integer id;

    private Integer roleId;

    private Integer permissionId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

}

