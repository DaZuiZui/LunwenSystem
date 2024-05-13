package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (UmsPermission)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:26:53
 */
public class UmsPermission implements Serializable {
    private static final long serialVersionUID = -85212747748228649L;

    private Integer id;
    /**
     * 父级权限名称
     */
    private Integer parentId;
    /**
     * 名称
     */
    private String name;
    /**
     * 权限值
     */
    private String value;
    /**
     * 图标
     */
    private String icon;
    /**
     * 权限类型 0目录 1菜单 2按钮（接口绑定权限）
     */
    private String type;
    /**
     * 前端资源路径
     */
    private String uri;
    /**
     * 状态
     */
    private String status;
    /**
     * 排序
     */
    private String sort;

    private Date createTime;

    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}

