package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (PmsResearch)实体类
 *
 * @author 1
 * @since 2024-05-13 13:24:10
 */
public class PmsResearch implements Serializable {
    private static final long serialVersionUID = 953129744127861099L;

    private Integer id;
    /**
     * 课题名称
     */
    private String name;
    /**
     * 合同来源
     */
    private String contractSource;
    /**
     * 合同编号
     */
    private String contractNumber;
    /**
     * 本人排名
     */
    private String rank;
    /**
     * 到账经费
     */
    private String receivedFunds;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 截止时间
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

    public String getContractSource() {
        return contractSource;
    }

    public void setContractSource(String contractSource) {
        this.contractSource = contractSource;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getReceivedFunds() {
        return receivedFunds;
    }

    public void setReceivedFunds(String receivedFunds) {
        this.receivedFunds = receivedFunds;
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

