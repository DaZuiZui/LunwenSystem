package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsResource;
import com.demo.lw.dao.UmsResourceDao;
import com.demo.lw.service.UmsResourceService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsResource)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 13:28:33
 */
@Service("umsResourceService")
public class UmsResourceServiceImpl implements UmsResourceService {
    @Resource
    private UmsResourceDao umsResourceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsResource queryById(Integer id) {
        return this.umsResourceDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsResource 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsResource> queryByPage(UmsResource umsResource, PageRequest pageRequest) {
        long total = this.umsResourceDao.count(umsResource);
        return new PageImpl<>(this.umsResourceDao.queryAllByLimit(umsResource, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsResource 实例对象
     * @return 实例对象
     */
    @Override
    public UmsResource insert(UmsResource umsResource) {
        this.umsResourceDao.insert(umsResource);
        return umsResource;
    }

    /**
     * 修改数据
     *
     * @param umsResource 实例对象
     * @return 实例对象
     */
    @Override
    public UmsResource update(UmsResource umsResource) {
        this.umsResourceDao.update(umsResource);
        return this.queryById(umsResource.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsResourceDao.deleteById(id) > 0;
    }
}
