package com.demo.lw.service;

import com.demo.lw.entity.UmsRoleResourceRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsRoleResourceRelation)表服务接口
 *
 * @author 1
 * @since 2024-05-13 13:32:25
 */
public interface UmsRoleResourceRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRoleResourceRelation queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsRoleResourceRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsRoleResourceRelation> queryByPage(UmsRoleResourceRelation umsRoleResourceRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsRoleResourceRelation 实例对象
     * @return 实例对象
     */
    UmsRoleResourceRelation insert(UmsRoleResourceRelation umsRoleResourceRelation);

    /**
     * 修改数据
     *
     * @param umsRoleResourceRelation 实例对象
     * @return 实例对象
     */
    UmsRoleResourceRelation update(UmsRoleResourceRelation umsRoleResourceRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
