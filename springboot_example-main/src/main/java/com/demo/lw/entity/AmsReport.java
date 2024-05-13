package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AmsReport)实体类
 *
 * @author 1
 * @since 2024-05-13 13:10:41
 */
public class AmsReport implements Serializable {
    private static final long serialVersionUID = -30425121353113081L;

    private Integer id;
    /**
     * 新闻事件
     */
    private String event;
    /**
     * 媒体名称
     */
    private String name;
    /**
     * 媒体级别
     */
    private String level;
    /**
     * 报道时间
     */
    private Date time;
    /**
     * 栏目
     */
    private String column;
    /**
     * 在线链接
     */
    private String link;
    /**
     * 备注信息
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

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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

