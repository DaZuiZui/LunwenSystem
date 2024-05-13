package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsAmsRelation;
import com.demo.lw.dao.UmsAmsRelationDao;
import com.demo.lw.service.UmsAmsRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsAmsRelation)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 13:24:53
 */
@Service("umsAmsRelationService")
public class UmsAmsRelationServiceImpl implements UmsAmsRelationService {
    @Resource
    private UmsAmsRelationDao umsAmsRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsAmsRelation queryById(Integer id) {
        return this.umsAmsRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsAmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsAmsRelation> queryByPage(UmsAmsRelation umsAmsRelation, PageRequest pageRequest) {
        long total = this.umsAmsRelationDao.count(umsAmsRelation);
        return new PageImpl<>(this.umsAmsRelationDao.queryAllByLimit(umsAmsRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsAmsRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAmsRelation insert(UmsAmsRelation umsAmsRelation) {
        this.umsAmsRelationDao.insert(umsAmsRelation);
        return umsAmsRelation;
    }

    /**
     * 修改数据
     *
     * @param umsAmsRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAmsRelation update(UmsAmsRelation umsAmsRelation) {
        this.umsAmsRelationDao.update(umsAmsRelation);
        return this.queryById(umsAmsRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsAmsRelationDao.deleteById(id) > 0;
    }
}
