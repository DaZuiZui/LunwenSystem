package com.demo.lw.service.impl;

import com.demo.lw.entity.AmsPmsRelation;
import com.demo.lw.dao.AmsPmsRelationDao;
import com.demo.lw.service.AmsPmsRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AmsPmsRelation)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:09:31
 */
@Service("amsPmsRelationService")
public class AmsPmsRelationServiceImpl implements AmsPmsRelationService {
    @Resource
    private AmsPmsRelationDao amsPmsRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsPmsRelation queryById(Integer id) {
        return this.amsPmsRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param amsPmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AmsPmsRelation> queryByPage(AmsPmsRelation amsPmsRelation, PageRequest pageRequest) {
        long total = this.amsPmsRelationDao.count(amsPmsRelation);
        return new PageImpl<>(this.amsPmsRelationDao.queryAllByLimit(amsPmsRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param amsPmsRelation 实例对象
     * @return 实例对象
     */
    @Override
    public AmsPmsRelation insert(AmsPmsRelation amsPmsRelation) {
        this.amsPmsRelationDao.insert(amsPmsRelation);
        return amsPmsRelation;
    }

    /**
     * 修改数据
     *
     * @param amsPmsRelation 实例对象
     * @return 实例对象
     */
    @Override
    public AmsPmsRelation update(AmsPmsRelation amsPmsRelation) {
        this.amsPmsRelationDao.update(amsPmsRelation);
        return this.queryById(amsPmsRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsPmsRelationDao.deleteById(id) > 0;
    }
}
