package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsRolePermissionRelation;
import com.demo.lw.dao.UmsRolePermissionRelationDao;
import com.demo.lw.service.UmsRolePermissionRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsRolePermissionRelation)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 13:30:47
 */
@Service("umsRolePermissionRelationService")
public class UmsRolePermissionRelationServiceImpl implements UmsRolePermissionRelationService {
    @Resource
    private UmsRolePermissionRelationDao umsRolePermissionRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsRolePermissionRelation queryById(Integer id) {
        return this.umsRolePermissionRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsRolePermissionRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsRolePermissionRelation> queryByPage(UmsRolePermissionRelation umsRolePermissionRelation, PageRequest pageRequest) {
        long total = this.umsRolePermissionRelationDao.count(umsRolePermissionRelation);
        return new PageImpl<>(this.umsRolePermissionRelationDao.queryAllByLimit(umsRolePermissionRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRolePermissionRelation insert(UmsRolePermissionRelation umsRolePermissionRelation) {
        this.umsRolePermissionRelationDao.insert(umsRolePermissionRelation);
        return umsRolePermissionRelation;
    }

    /**
     * 修改数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRolePermissionRelation update(UmsRolePermissionRelation umsRolePermissionRelation) {
        this.umsRolePermissionRelationDao.update(umsRolePermissionRelation);
        return this.queryById(umsRolePermissionRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsRolePermissionRelationDao.deleteById(id) > 0;
    }
}
