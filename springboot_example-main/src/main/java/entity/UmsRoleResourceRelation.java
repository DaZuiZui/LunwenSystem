package entity;

import java.io.Serializable;

/**
 * (UmsRoleResourceRelation)实体类
 *
 * @author makejava
 * @since 2024-05-13 13:32:09
 */
public class UmsRoleResourceRelation implements Serializable {
    private static final long serialVersionUID = -14737105613444043L;

    private Integer id;

    private Integer roleId;

    private Integer resourceId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

}

