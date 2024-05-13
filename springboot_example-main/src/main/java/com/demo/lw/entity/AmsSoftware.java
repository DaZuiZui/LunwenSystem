package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AmsSoftware)实体类
 *
 * @author 1
 * @since 2024-05-13 13:12:43
 */
public class AmsSoftware implements Serializable {
    private static final long serialVersionUID = -34034165427812393L;

    private Integer id;
    /**
     * 著作权名称
     */
    private String name;
    /**
     * 证书号
     */
    private String certificateNumber;
    /**
     * 本人排名
     */
    private String rank;
    /**
     * 开发完成时间
     */
    private Date completionTime;
    /**
     * 获得时间
     */
    private Date obtainTime;
    /**
     * 登记号
     */
    private String registrationNumber;
    /**
     * 著作权类型
     */
    private String type;
    /**
     * 著作权人
     */
    private String copyrightOwner;
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

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Date getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(Date completionTime) {
        this.completionTime = completionTime;
    }

    public Date getObtainTime() {
        return obtainTime;
    }

    public void setObtainTime(Date obtainTime) {
        this.obtainTime = obtainTime;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCopyrightOwner() {
        return copyrightOwner;
    }

    public void setCopyrightOwner(String copyrightOwner) {
        this.copyrightOwner = copyrightOwner;
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

