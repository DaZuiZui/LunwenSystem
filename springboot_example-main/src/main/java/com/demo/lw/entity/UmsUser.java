package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (UmsUser)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:50:41
 */
public class UmsUser implements Serializable {
    private static final long serialVersionUID = -64850455309090256L;

    private Integer id;
    /**
     * 登录名称
     */
    private String loginName;
    /**
     * 登录密码
     */
    private String loginPwd;
    /**
     * 真实姓名
     */
    private String actualName;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 学院id
     */
    private Integer collegeId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否启用 1是0否
     */
    private Integer status;
    /**
     * 是否为超级管理员 1是0否
     */
    private Integer administratorFlag;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更改时间
     */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAdministratorFlag() {
        return administratorFlag;
    }

    public void setAdministratorFlag(Integer administratorFlag) {
        this.administratorFlag = administratorFlag;
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

