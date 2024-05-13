package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsUserPermissionRelation;
import com.demo.lw.dao.UmsUserPermissionRelationDao;
import com.demo.lw.service.UmsUserPermissionRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsUserPermissionRelation)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:51:27
 */
@Service("umsUserPermissionRelationService")
public class UmsUserPermissionRelationServiceImpl implements UmsUserPermissionRelationService {
    @Resource
    private UmsUserPermissionRelationDao umsUserPermissionRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsUserPermissionRelation queryById(Integer id) {
        return this.umsUserPermissionRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsUserPermissionRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsUserPermissionRelation> queryByPage(UmsUserPermissionRelation umsUserPermissionRelation, PageRequest pageRequest) {
        long total = this.umsUserPermissionRelationDao.count(umsUserPermissionRelation);
        return new PageImpl<>(this.umsUserPermissionRelationDao.queryAllByLimit(umsUserPermissionRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsUserPermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsUserPermissionRelation insert(UmsUserPermissionRelation umsUserPermissionRelation) {
        this.umsUserPermissionRelationDao.insert(umsUserPermissionRelation);
        return umsUserPermissionRelation;
    }

    /**
     * 修改数据
     *
     * @param umsUserPermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsUserPermissionRelation update(UmsUserPermissionRelation umsUserPermissionRelation) {
        this.umsUserPermissionRelationDao.update(umsUserPermissionRelation);
        return this.queryById(umsUserPermissionRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsUserPermissionRelationDao.deleteById(id) > 0;
    }
}
