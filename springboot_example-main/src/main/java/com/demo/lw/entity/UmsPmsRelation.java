package com.demo.lw.entity;

import java.io.Serializable;

/**
 * (UmsPmsRelation)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:27:42
 */
public class UmsPmsRelation implements Serializable {
    private static final long serialVersionUID = 713739329784755559L;

    private Integer id;

    private Integer pmsId;

    private String pmsType;

    private Integer umsId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPmsId() {
        return pmsId;
    }

    public void setPmsId(Integer pmsId) {
        this.pmsId = pmsId;
    }

    public String getPmsType() {
        return pmsType;
    }

    public void setPmsType(String pmsType) {
        this.pmsType = pmsType;
    }

    public Integer getUmsId() {
        return umsId;
    }

    public void setUmsId(Integer umsId) {
        this.umsId = umsId;
    }

}

