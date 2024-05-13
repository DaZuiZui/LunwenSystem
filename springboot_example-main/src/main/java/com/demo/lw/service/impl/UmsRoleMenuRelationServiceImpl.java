package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsRoleMenuRelation;
import com.demo.lw.dao.UmsRoleMenuRelationDao;
import com.demo.lw.service.UmsRoleMenuRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsRoleMenuRelation)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 13:29:48
 */
@Service("umsRoleMenuRelationService")
public class UmsRoleMenuRelationServiceImpl implements UmsRoleMenuRelationService {
    @Resource
    private UmsRoleMenuRelationDao umsRoleMenuRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsRoleMenuRelation queryById(Integer id) {
        return this.umsRoleMenuRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsRoleMenuRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsRoleMenuRelation> queryByPage(UmsRoleMenuRelation umsRoleMenuRelation, PageRequest pageRequest) {
        long total = this.umsRoleMenuRelationDao.count(umsRoleMenuRelation);
        return new PageImpl<>(this.umsRoleMenuRelationDao.queryAllByLimit(umsRoleMenuRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsRoleMenuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRoleMenuRelation insert(UmsRoleMenuRelation umsRoleMenuRelation) {
        this.umsRoleMenuRelationDao.insert(umsRoleMenuRelation);
        return umsRoleMenuRelation;
    }

    /**
     * 修改数据
     *
     * @param umsRoleMenuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRoleMenuRelation update(UmsRoleMenuRelation umsRoleMenuRelation) {
        this.umsRoleMenuRelationDao.update(umsRoleMenuRelation);
        return this.queryById(umsRoleMenuRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsRoleMenuRelationDao.deleteById(id) > 0;
    }
}
