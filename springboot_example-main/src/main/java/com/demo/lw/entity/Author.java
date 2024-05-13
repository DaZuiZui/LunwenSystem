package com.demo.lw.entity;

import java.io.Serializable;

/**
 * (Author)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:15:02
 */
public class Author implements Serializable {
    private static final long serialVersionUID = -70664405768535780L;

    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 排序
     */
    private String sort;
    /**
     * 作者身份
     */
    private String identity;
    /**
     * 通讯作者
     */
    private Integer correspondAuthor;
    /**
     * 共同一作
     */
    private Integer jointWork;
    /**
     * 单位名称
     */
    private String unitName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Integer getCorrespondAuthor() {
        return correspondAuthor;
    }

    public void setCorrespondAuthor(Integer correspondAuthor) {
        this.correspondAuthor = correspondAuthor;
    }

    public Integer getJointWork() {
        return jointWork;
    }

    public void setJointWork(Integer jointWork) {
        this.jointWork = jointWork;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

}

