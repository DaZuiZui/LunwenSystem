package com.demo.lw.service;

import com.demo.lw.entity.AmsPmsRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AmsPmsRelation)表服务接口
 *
 * @author 1
 * @since 2024-05-13 13:09:31
 */
public interface AmsPmsRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsPmsRelation queryById(Integer id);

    /**
     * 分页查询
     *
     * @param amsPmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AmsPmsRelation> queryByPage(AmsPmsRelation amsPmsRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param amsPmsRelation 实例对象
     * @return 实例对象
     */
    AmsPmsRelation insert(AmsPmsRelation amsPmsRelation);

    /**
     * 修改数据
     *
     * @param amsPmsRelation 实例对象
     * @return 实例对象
     */
    AmsPmsRelation update(AmsPmsRelation amsPmsRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
