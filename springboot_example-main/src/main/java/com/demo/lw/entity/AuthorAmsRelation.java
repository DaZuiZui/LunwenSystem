package com.demo.lw.entity;

import java.io.Serializable;

/**
 * (AuthorAmsRelation)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:15:42
 */
public class AuthorAmsRelation implements Serializable {
    private static final long serialVersionUID = -84079782752074374L;

    private Integer id;
    /**
     * 成果类型
     */
    private String amsType;

    private Integer amsId;

    private Integer authorId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmsType() {
        return amsType;
    }

    public void setAmsType(String amsType) {
        this.amsType = amsType;
    }

    public Integer getAmsId() {
        return amsId;
    }

    public void setAmsId(Integer amsId) {
        this.amsId = amsId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

}

