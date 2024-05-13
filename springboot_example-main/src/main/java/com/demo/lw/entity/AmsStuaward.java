package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AmsStuaward)实体类
 *
 * @author 1
 * @since 2024-05-13 13:13:23
 */
public class AmsStuaward implements Serializable {
    private static final long serialVersionUID = -73796399923729800L;

    private Integer id;
    /**
     * 比赛名次
     */
    private String name;
    /**
     * 获奖学生姓名
     */
    private String stuName;
    /**
     * 本人排名
     */
    private String rank;
    /**
     * 获奖名次
     */
    private String awardRank;
    /**
     * 级别
     */
    private String level;
    /**
     * 授予单位
     */
    private String grantUnit;
    /**
     * 获奖时间
     */
    private Date awardTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 关联课题id
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

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getAwardRank() {
        return awardRank;
    }

    public void setAwardRank(String awardRank) {
        this.awardRank = awardRank;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getGrantUnit() {
        return grantUnit;
    }

    public void setGrantUnit(String grantUnit) {
        this.grantUnit = grantUnit;
    }

    public Date getAwardTime() {
        return awardTime;
    }

    public void setAwardTime(Date awardTime) {
        this.awardTime = awardTime;
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

