package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsPmsRelation;
import com.demo.lw.dao.UmsPmsRelationDao;
import com.demo.lw.service.UmsPmsRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsPmsRelation)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 13:27:42
 */
@Service("umsPmsRelationService")
public class UmsPmsRelationServiceImpl implements UmsPmsRelationService {
    @Resource
    private UmsPmsRelationDao umsPmsRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsPmsRelation queryById(Integer id) {
        return this.umsPmsRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsPmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsPmsRelation> queryByPage(UmsPmsRelation umsPmsRelation, PageRequest pageRequest) {
        long total = this.umsPmsRelationDao.count(umsPmsRelation);
        return new PageImpl<>(this.umsPmsRelationDao.queryAllByLimit(umsPmsRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsPmsRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsPmsRelation insert(UmsPmsRelation umsPmsRelation) {
        this.umsPmsRelationDao.insert(umsPmsRelation);
        return umsPmsRelation;
    }

    /**
     * 修改数据
     *
     * @param umsPmsRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsPmsRelation update(UmsPmsRelation umsPmsRelation) {
        this.umsPmsRelationDao.update(umsPmsRelation);
        return this.queryById(umsPmsRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsPmsRelationDao.deleteById(id) > 0;
    }
}
