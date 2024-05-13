package com.demo.lw.entity;

import java.io.Serializable;

/**
 * (AmsPmsRelation)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:09:31
 */
public class AmsPmsRelation implements Serializable {
    private static final long serialVersionUID = -37575233837701099L;

    private Integer id;

    private Integer amsId;

    private Integer pmsId;

    private String amsType;

    private String pmsType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmsId() {
        return amsId;
    }

    public void setAmsId(Integer amsId) {
        this.amsId = amsId;
    }

    public Integer getPmsId() {
        return pmsId;
    }

    public void setPmsId(Integer pmsId) {
        this.pmsId = pmsId;
    }

    public String getAmsType() {
        return amsType;
    }

    public void setAmsType(String amsType) {
        this.amsType = amsType;
    }

    public String getPmsType() {
        return pmsType;
    }

    public void setPmsType(String pmsType) {
        this.pmsType = pmsType;
    }

}

