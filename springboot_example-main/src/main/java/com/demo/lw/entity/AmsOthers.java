package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AmsOthers)实体类
 *
 * @author 1
 * @since 2024-05-13 13:05:51
 */
public class AmsOthers implements Serializable {
    private static final long serialVersionUID = 887266004809899298L;

    private Integer id;
    /**
     * 成果名称
     */
    private String name;
    /**
     * 本人排名
     */
    private String rank;
    /**
     * 获得时间
     */
    private Date obtainTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 关联课程id
     */
    private Integer projectId;
    /**
     * 共同作者id
     */
    private Integer authorId;


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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Date getObtainTime() {
        return obtainTime;
    }

    public void setObtainTime(Date obtainTime) {
        this.obtainTime = obtainTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

}

