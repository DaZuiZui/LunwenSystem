package com.demo.lw.service.impl;

import com.demo.lw.entity.AuthorAmsRelation;
import com.demo.lw.dao.AuthorAmsRelationDao;
import com.demo.lw.service.AuthorAmsRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AuthorAmsRelation)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:15:42
 */
@Service("authorAmsRelationService")
public class AuthorAmsRelationServiceImpl implements AuthorAmsRelationService {
    @Resource
    private AuthorAmsRelationDao authorAmsRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuthorAmsRelation queryById(Integer id) {
        return this.authorAmsRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param authorAmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AuthorAmsRelation> queryByPage(AuthorAmsRelation authorAmsRelation, PageRequest pageRequest) {
        long total = this.authorAmsRelationDao.count(authorAmsRelation);
        return new PageImpl<>(this.authorAmsRelationDao.queryAllByLimit(authorAmsRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param authorAmsRelation 实例对象
     * @return 实例对象
     */
    @Override
    public AuthorAmsRelation insert(AuthorAmsRelation authorAmsRelation) {
        this.authorAmsRelationDao.insert(authorAmsRelation);
        return authorAmsRelation;
    }

    /**
     * 修改数据
     *
     * @param authorAmsRelation 实例对象
     * @return 实例对象
     */
    @Override
    public AuthorAmsRelation update(AuthorAmsRelation authorAmsRelation) {
        this.authorAmsRelationDao.update(authorAmsRelation);
        return this.queryById(authorAmsRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.authorAmsRelationDao.deleteById(id) > 0;
    }
}
