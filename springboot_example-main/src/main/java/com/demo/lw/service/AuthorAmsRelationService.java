package com.demo.lw.service;

import com.demo.lw.entity.AuthorAmsRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AuthorAmsRelation)表服务接口
 *
 * @author 1
 * @since 2024-05-13 13:15:42
 */
public interface AuthorAmsRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthorAmsRelation queryById(Integer id);

    /**
     * 分页查询
     *
     * @param authorAmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AuthorAmsRelation> queryByPage(AuthorAmsRelation authorAmsRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param authorAmsRelation 实例对象
     * @return 实例对象
     */
    AuthorAmsRelation insert(AuthorAmsRelation authorAmsRelation);

    /**
     * 修改数据
     *
     * @param authorAmsRelation 实例对象
     * @return 实例对象
     */
    AuthorAmsRelation update(AuthorAmsRelation authorAmsRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
