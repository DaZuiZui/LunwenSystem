package com.demo.lw.service;

import com.demo.lw.entity.UmsRolePermissionRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsRolePermissionRelation)表服务接口
 *
 * @author 1
 * @since 2024-05-13 13:30:47
 */
public interface UmsRolePermissionRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRolePermissionRelation queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsRolePermissionRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsRolePermissionRelation> queryByPage(UmsRolePermissionRelation umsRolePermissionRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 实例对象
     */
    UmsRolePermissionRelation insert(UmsRolePermissionRelation umsRolePermissionRelation);

    /**
     * 修改数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 实例对象
     */
    UmsRolePermissionRelation update(UmsRolePermissionRelation umsRolePermissionRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
