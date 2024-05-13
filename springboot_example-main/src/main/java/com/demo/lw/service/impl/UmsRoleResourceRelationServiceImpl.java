package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsRoleResourceRelation;
import com.demo.lw.dao.UmsRoleResourceRelationDao;
import com.demo.lw.service.UmsRoleResourceRelationService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsRoleResourceRelation)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 13:32:25
 */
@Service("umsRoleResourceRelationService")
public class UmsRoleResourceRelationServiceImpl implements UmsRoleResourceRelationService {
    @Resource
    private UmsRoleResourceRelationDao umsRoleResourceRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsRoleResourceRelation queryById(Integer id) {
        return this.umsRoleResourceRelationDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsRoleResourceRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsRoleResourceRelation> queryByPage(UmsRoleResourceRelation umsRoleResourceRelation, PageRequest pageRequest) {
        long total = this.umsRoleResourceRelationDao.count(umsRoleResourceRelation);
        return new PageImpl<>(this.umsRoleResourceRelationDao.queryAllByLimit(umsRoleResourceRelation, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsRoleResourceRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRoleResourceRelation insert(UmsRoleResourceRelation umsRoleResourceRelation) {
        this.umsRoleResourceRelationDao.insert(umsRoleResourceRelation);
        return umsRoleResourceRelation;
    }

    /**
     * 修改数据
     *
     * @param umsRoleResourceRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRoleResourceRelation update(UmsRoleResourceRelation umsRoleResourceRelation) {
        this.umsRoleResourceRelationDao.update(umsRoleResourceRelation);
        return this.queryById(umsRoleResourceRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsRoleResourceRelationDao.deleteById(id) > 0;
    }
}
