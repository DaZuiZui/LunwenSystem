package com.demo.lw.service;

import com.demo.lw.entity.UmsAmsRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsAmsRelation)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:24:53
 */
public interface UmsAmsRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsAmsRelation queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsAmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsAmsRelation> queryByPage(UmsAmsRelation umsAmsRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsAmsRelation 实例对象
     * @return 实例对象
     */
    UmsAmsRelation insert(UmsAmsRelation umsAmsRelation);

    /**
     * 修改数据
     *
     * @param umsAmsRelation 实例对象
     * @return 实例对象
     */
    UmsAmsRelation update(UmsAmsRelation umsAmsRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}