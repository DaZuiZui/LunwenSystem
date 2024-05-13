package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (UmsResource)实体类
 *
 * @author 1
 * @since 2024-05-13 13:28:33
 */
public class UmsResource implements Serializable {
    private static final long serialVersionUID = 221631716697602320L;
    /**
     * 资源id
     */
    private Integer id;
    /**
     * 资源名称
     */
    private String name;
    /**
     * 路径url
     */
    private String url;
    /**
     * 备注
     */
    private String remark;

    private Date createTime;

    private Date updateTime;


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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

