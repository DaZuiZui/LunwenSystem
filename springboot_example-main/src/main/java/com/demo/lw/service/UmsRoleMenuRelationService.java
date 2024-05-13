package com.demo.lw.service;

import com.demo.lw.entity.UmsRoleMenuRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsRoleMenuRelation)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:29:48
 */
public interface UmsRoleMenuRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRoleMenuRelation queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsRoleMenuRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsRoleMenuRelation> queryByPage(UmsRoleMenuRelation umsRoleMenuRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsRoleMenuRelation 实例对象
     * @return 实例对象
     */
    UmsRoleMenuRelation insert(UmsRoleMenuRelation umsRoleMenuRelation);

    /**
     * 修改数据
     *
     * @param umsRoleMenuRelation 实例对象
     * @return 实例对象
     */
    UmsRoleMenuRelation update(UmsRoleMenuRelation umsRoleMenuRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
