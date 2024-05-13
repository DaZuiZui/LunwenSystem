package com.demo.lw.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AmsMaterial)实体类
 *
 * @author 1
 * @since 2024-05-13 11:19:31
 */
public class AmsMaterial implements Serializable {
    private static final long serialVersionUID = 519709177141165536L;

    private Integer id;
    /**
     * 材料标题
     */
    private String name;
    /**
     * 培训单位
     */
    private String trainUnit;
    /**
     * 课时
     */
    private String lesson;
    /**
     * 等级
     */
    private String level;
    /**
     * 获得时间
     */
    private Date obtainTime;
    /**
     * 备注
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainUnit() {
        return trainUnit;
    }

    public void setTrainUnit(String trainUnit) {
        this.trainUnit = trainUnit;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getObtainTime() {
        return obtainTime;
    }

    public void setObtainTime(Date obtainTime) {
        this.obtainTime = obtainTime;
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

