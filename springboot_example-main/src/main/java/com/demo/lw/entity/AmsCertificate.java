package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AmsCertificate)实体类
 *
 * @author 1
 * @since 2024-05-13 11:17:43
 */
public class AmsCertificate implements Serializable {
    private static final long serialVersionUID = 942082362824421625L;

    private Integer id;
    /**
     * 档案标题
     */
    private String title;
    /**
     * 证书类型
     */
    private String type;
    /**
     * 获得时间
     */
    private Date obtainTime;
    /**
     * 证书编号
     */
    private String certificateNumber;
    /**
     * 授予机构
     */
    private String grantInstitutation;
    /**
     * 备注
     */
    private String remark;
    /**
     * 关联课题id
     */
    private Integer projectId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getObtainTime() {
        return obtainTime;
    }

    public void setObtainTime(Date obtainTime) {
        this.obtainTime = obtainTime;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getGrantInstitutation() {
        return grantInstitutation;
    }

    public void setGrantInstitutation(String grantInstitutation) {
        this.grantInstitutation = grantInstitutation;
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

}

