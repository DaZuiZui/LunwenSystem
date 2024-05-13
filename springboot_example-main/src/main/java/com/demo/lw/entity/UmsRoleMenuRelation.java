package com.demo.lw.entity;

import java.io.Serializable;

/**
 * (UmsRoleMenuRelation)实体类
 *
 * @author 1
 * @since 2024-05-13 13:29:48
 */
public class UmsRoleMenuRelation implements Serializable {
    private static final long serialVersionUID = -37593829183823198L;

    private Integer id;

    private Integer roleId;

    private Integer menuId;


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

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

}

