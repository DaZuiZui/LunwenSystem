package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (PmsGoverresearch)实体类
 *
 * @author 1
 * @since 2024-05-13 13:18:52
 */
public class PmsGoverresearch implements Serializable {
    private static final long serialVersionUID = 930873728753303338L;

    private Integer id;
    /**
     * 课题名称
     */
    private String name;
    /**
     * 基金名称
     */
    private String fundName;
    /**
     * 课题类型
     */
    private String type;
    /**
     * 授予单位
     */
    private String grantUnit;
    /**
     * 课题等级
     */
    private String level;
    /**
     * 课题编号
     */
    private String projectNumber;
    /**
     * 到账经费
     */
    private String receivedFunds;
    /**
     * 本人排名
     */
    private String rank;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 截止日期
     */
    private Date deadline;
    /**
     * 课题状态
     */
    private String status;
    /**
     * 备注
     */
    private String remark;
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

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrantUnit() {
        return grantUnit;
    }

    public void setGrantUnit(String grantUnit) {
        this.grantUnit = grantUnit;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getReceivedFunds() {
        return receivedFunds;
    }

    public void setReceivedFunds(String receivedFunds) {
        this.receivedFunds = receivedFunds;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

}

