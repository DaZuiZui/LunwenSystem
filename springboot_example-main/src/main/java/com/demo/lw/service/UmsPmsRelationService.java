package com.demo.lw.service;

import com.demo.lw.entity.UmsPmsRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsPmsRelation)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:27:42
 */
public interface UmsPmsRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsPmsRelation queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsPmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsPmsRelation> queryByPage(UmsPmsRelation umsPmsRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsPmsRelation 实例对象
     * @return 实例对象
     */
    UmsPmsRelation insert(UmsPmsRelation umsPmsRelation);

    /**
     * 修改数据
     *
     * @param umsPmsRelation 实例对象
     * @return 实例对象
     */
    UmsPmsRelation update(UmsPmsRelation umsPmsRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
