package com.demo.lw.entity;

import java.io.Serializable;

/**
 * (AuthorPmsRelation)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:17:30
 */
public class AuthorPmsRelation implements Serializable {
    private static final long serialVersionUID = 270434697600683049L;

    private Integer id;
    /**
     * 课题类型
     */
    private String pmsType;

    private Integer pmsId;

    private Integer authorId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPmsType() {
        return pmsType;
    }

    public void setPmsType(String pmsType) {
        this.pmsType = pmsType;
    }

    public Integer getPmsId() {
        return pmsId;
    }

    public void setPmsId(Integer pmsId) {
        this.pmsId = pmsId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

}

