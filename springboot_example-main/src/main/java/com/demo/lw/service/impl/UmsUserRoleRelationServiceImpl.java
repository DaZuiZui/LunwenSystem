package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsUserRoleRelation;
import com.demo.lw.dao.UmsUserRoleRelationDao;
import com.demo.lw.service.UmsUserRoleRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsUserRoleRelation)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 13:52:57
 */
@Service("umsUserRoleRelationService")
public class UmsUserRoleRelationServiceImpl implements UmsUserRoleRelationService {
    @Resource
    private UmsUserRoleRelationDao umsUserRoleRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsUserRoleRelation queryById(Integer id) {
        return this.umsUserRoleRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsUserRoleRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsUserRoleRelation> queryByPage(UmsUserRoleRelation umsUserRoleRelation, PageRequest pageRequest) {
        long total = this.umsUserRoleRelationDao.count(umsUserRoleRelation);
        return new PageImpl<>(this.umsUserRoleRelationDao.queryAllByLimit(umsUserRoleRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsUserRoleRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsUserRoleRelation insert(UmsUserRoleRelation umsUserRoleRelation) {
        this.umsUserRoleRelationDao.insert(umsUserRoleRelation);
        return umsUserRoleRelation;
    }

    /**
     * 修改数据
     *
     * @param umsUserRoleRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsUserRoleRelation update(UmsUserRoleRelation umsUserRoleRelation) {
        this.umsUserRoleRelationDao.update(umsUserRoleRelation);
        return this.queryById(umsUserRoleRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsUserRoleRelationDao.deleteById(id) > 0;
    }
}
