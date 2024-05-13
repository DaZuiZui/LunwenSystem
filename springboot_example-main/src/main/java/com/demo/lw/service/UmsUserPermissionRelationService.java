package com.demo.lw.service;

import com.demo.lw.entity.UmsUserPermissionRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsUserPermissionRelation)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:51:27
 */
public interface UmsUserPermissionRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsUserPermissionRelation queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsUserPermissionRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsUserPermissionRelation> queryByPage(UmsUserPermissionRelation umsUserPermissionRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsUserPermissionRelation 实例对象
     * @return 实例对象
     */
    UmsUserPermissionRelation insert(UmsUserPermissionRelation umsUserPermissionRelation);

    /**
     * 修改数据
     *
     * @param umsUserPermissionRelation 实例对象
     * @return 实例对象
     */
    UmsUserPermissionRelation update(UmsUserPermissionRelation umsUserPermissionRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
