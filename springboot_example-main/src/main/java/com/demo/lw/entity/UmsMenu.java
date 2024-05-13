package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (UmsMenu)实体类
 *
 * @author 1
 * @since 2024-05-13 13:26:02
 */
public class UmsMenu implements Serializable {
    private static final long serialVersionUID = -54560305444944153L;

    private Integer id;
    /**
     * 父级id
     */
    private Integer parentId;
    /**
     * 菜单名称
     */
    private String title;
    /**
     * 菜单等级
     */
    private String level;
    /**
     * 菜单排序
     */
    private String sort;
    /**
     * 前端名称
     */
    private String name;
    /**
     * 前端图标
     */
    private String icon;
    /**
     * 是否隐藏 0否 1是
     */
    private Integer hidden;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
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

