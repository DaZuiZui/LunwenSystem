package com.demo.lw.service;

import com.demo.lw.entity.AuthorPmsRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AuthorPmsRelation)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:17:30
 */
public interface AuthorPmsRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthorPmsRelation queryById(Integer id);

    /**
     * 分页查询
     *
     * @param authorPmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AuthorPmsRelation> queryByPage(AuthorPmsRelation authorPmsRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param authorPmsRelation 实例对象
     * @return 实例对象
     */
    AuthorPmsRelation insert(AuthorPmsRelation authorPmsRelation);

    /**
     * 修改数据
     *
     * @param authorPmsRelation 实例对象
     * @return 实例对象
     */
    AuthorPmsRelation update(AuthorPmsRelation authorPmsRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
