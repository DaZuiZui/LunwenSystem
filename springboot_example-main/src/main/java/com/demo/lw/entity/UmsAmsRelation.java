package com.demo.lw.entity;

import java.io.Serializable;

/**
 * (UmsAmsRelation)实体类
 *
 * @author 1
 * @since 2024-05-13 13:24:53
 */
public class UmsAmsRelation implements Serializable {
    private static final long serialVersionUID = -52955052947313320L;

    private Integer id;

    private Integer umsId;

    private Integer amsId;

    private String amsType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUmsId() {
        return umsId;
    }

    public void setUmsId(Integer umsId) {
        this.umsId = umsId;
    }

    public Integer getAmsId() {
        return amsId;
    }

    public void setAmsId(Integer amsId) {
        this.amsId = amsId;
    }

    public String getAmsType() {
        return amsType;
    }

    public void setAmsType(String amsType) {
        this.amsType = amsType;
    }

}

