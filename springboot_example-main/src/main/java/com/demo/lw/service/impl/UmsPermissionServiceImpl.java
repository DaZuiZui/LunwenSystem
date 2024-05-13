package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsPermission;
import com.demo.lw.dao.UmsPermissionDao;
import com.demo.lw.service.UmsPermissionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsPermission)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:26:53
 */
@Service("umsPermissionService")
public class UmsPermissionServiceImpl implements UmsPermissionService {
    @Resource
    private UmsPermissionDao umsPermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsPermission queryById(Integer id) {
        return this.umsPermissionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsPermission 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsPermission> queryByPage(UmsPermission umsPermission, PageRequest pageRequest) {
        long total = this.umsPermissionDao.count(umsPermission);
        return new PageImpl<>(this.umsPermissionDao.queryAllByLimit(umsPermission, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    @Override
    public UmsPermission insert(UmsPermission umsPermission) {
        this.umsPermissionDao.insert(umsPermission);
        return umsPermission;
    }

    /**
     * 修改数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    @Override
    public UmsPermission update(UmsPermission umsPermission) {
        this.umsPermissionDao.update(umsPermission);
        return this.queryById(umsPermission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsPermissionDao.deleteById(id) > 0;
    }
}
