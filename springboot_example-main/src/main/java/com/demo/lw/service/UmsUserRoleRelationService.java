package com.demo.lw.service;

import com.demo.lw.entity.UmsUserRoleRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsUserRoleRelation)表服务接口
 *
 * @author 1
 * @since 2024-05-13 13:52:57
 */
public interface UmsUserRoleRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsUserRoleRelation queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsUserRoleRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsUserRoleRelation> queryByPage(UmsUserRoleRelation umsUserRoleRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsUserRoleRelation 实例对象
     * @return 实例对象
     */
    UmsUserRoleRelation insert(UmsUserRoleRelation umsUserRoleRelation);

    /**
     * 修改数据
     *
     * @param umsUserRoleRelation 实例对象
     * @return 实例对象
     */
    UmsUserRoleRelation update(UmsUserRoleRelation umsUserRoleRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
