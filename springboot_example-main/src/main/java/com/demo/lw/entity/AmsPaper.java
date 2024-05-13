package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AmsPaper)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:07:07
 */
public class AmsPaper implements Serializable {
    private static final long serialVersionUID = -95859277941935995L;

    private Integer id;
    /**
     * 论文名称
     */
    private String title;
    /**
     * 论文类型
     */
    private String type;
    /**
     * 论文领域
     */
    private String area;
    /**
     * 本人排名
     */
    private String rank;
    /**
     * 通讯作者 0否 1 是
     */
    private Integer correspondingAuthor;
    /**
     * 刊物名称
     */
    private String name;
    /**
     * 收录检索
     */
    private String index;
    /**
     * 发表时间
     */
    private Date publicationTime;
    /**
     * DOI号
     */
    private String doiNumber;
    /**
     * 引用次数
     */
    private String referenceCount;
    /**
     * 关键词
     */
    private String keyword;
    /**
     * 作者信息
     */
    private String authorInfo;
    /**
     * 起止页码
     */
    private Integer startingAndEndingPageNumber;
    /**
     * 关联课题id
     */
    private Integer projectId;
    /**
     * 影响银子
     */
    private String impactFactor;
    /**
     * 卷号
     */
    private String volumeNumber;
    /**
     * 期号
     */
    private String issue;
    /**
     * ISSN号
     */
    private String issnNumber;
    /**
     * CN号
     */
    private String cnNumber;
    /**
     * 摘要
     */
    private String abstract;
    /**
     * 备注
     */
    private String remark;


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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Integer getCorrespondingAuthor() {
        return correspondingAuthor;
    }

    public void setCorrespondingAuthor(Integer correspondingAuthor) {
        this.correspondingAuthor = correspondingAuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }

    public String getDoiNumber() {
        return doiNumber;
    }

    public void setDoiNumber(String doiNumber) {
        this.doiNumber = doiNumber;
    }

    public String getReferenceCount() {
        return referenceCount;
    }

    public void setReferenceCount(String referenceCount) {
        this.referenceCount = referenceCount;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(String authorInfo) {
        this.authorInfo = authorInfo;
    }

    public Integer getStartingAndEndingPageNumber() {
        return startingAndEndingPageNumber;
    }

    public void setStartingAndEndingPageNumber(Integer startingAndEndingPageNumber) {
        this.startingAndEndingPageNumber = startingAndEndingPageNumber;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getImpactFactor() {
        return impactFactor;
    }

    public void setImpactFactor(String impactFactor) {
        this.impactFactor = impactFactor;
    }

    public String getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(String volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getIssnNumber() {
        return issnNumber;
    }

    public void setIssnNumber(String issnNumber) {
        this.issnNumber = issnNumber;
    }

    public String getCnNumber() {
        return cnNumber;
    }

    public void setCnNumber(String cnNumber) {
        this.cnNumber = cnNumber;
    }

    public String getAbstract() {
        return abstract;
    }

    public void setAbstract(String abstract) {
        this.abstract = abstract;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

