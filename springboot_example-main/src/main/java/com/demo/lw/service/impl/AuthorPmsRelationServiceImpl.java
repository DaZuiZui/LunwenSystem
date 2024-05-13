package com.demo.lw.service.impl;

import com.demo.lw.entity.AuthorPmsRelation;
import com.demo.lw.dao.AuthorPmsRelationDao;
import com.demo.lw.service.AuthorPmsRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AuthorPmsRelation)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:17:30
 */
@Service("authorPmsRelationService")
public class AuthorPmsRelationServiceImpl implements AuthorPmsRelationService {
    @Resource
    private AuthorPmsRelationDao authorPmsRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuthorPmsRelation queryById(Integer id) {
        return this.authorPmsRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param authorPmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AuthorPmsRelation> queryByPage(AuthorPmsRelation authorPmsRelation, PageRequest pageRequest) {
        long total = this.authorPmsRelationDao.count(authorPmsRelation);
        return new PageImpl<>(this.authorPmsRelationDao.queryAllByLimit(authorPmsRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param authorPmsRelation 实例对象
     * @return 实例对象
     */
    @Override
    public AuthorPmsRelation insert(AuthorPmsRelation authorPmsRelation) {
        this.authorPmsRelationDao.insert(authorPmsRelation);
        return authorPmsRelation;
    }

    /**
     * 修改数据
     *
     * @param authorPmsRelation 实例对象
     * @return 实例对象
     */
    @Override
    public AuthorPmsRelation update(AuthorPmsRelation authorPmsRelation) {
        this.authorPmsRelationDao.update(authorPmsRelation);
        return this.queryById(authorPmsRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.authorPmsRelationDao.deleteById(id) > 0;
    }
}
