package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AmsBook)实体类
 *
 * @author 1
 * @since 2024-05-13 11:14:59
 */
public class AmsBook implements Serializable {
    private static final long serialVersionUID = 594822992279885111L;

    private Integer id;
    /**
     * 著作名称
     */
    private String name;
    /**
     * 出版号
     */
    private String publicationNumber;
    /**
     * 身份
     */
    private String identity;
    /**
     * 本人排名
     */
    private String rank;
    /**
     * 出版社
     */
    private String publishHouse;
    /**
     * 著作类型
     */
    private String type;
    /**
     * 字数
     */
    private String wordCount;
    /**
     * 出版地
     */
    private String publicationLocation;
    /**
     * 出版时间
     */
    private Date publicationTime;
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

    public String getPublicationNumber() {
        return publicationNumber;
    }

    public void setPublicationNumber(String publicationNumber) {
        this.publicationNumber = publicationNumber;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public String getPublicationLocation() {
        return publicationLocation;
    }

    public void setPublicationLocation(String publicationLocation) {
        this.publicationLocation = publicationLocation;
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
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

