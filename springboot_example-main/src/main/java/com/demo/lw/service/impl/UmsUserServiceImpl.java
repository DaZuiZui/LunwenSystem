package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsUser;
import com.demo.lw.dao.UmsUserDao;
import com.demo.lw.service.UmsUserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsUser)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:50:41
 */
@Service("umsUserService")
public class UmsUserServiceImpl implements UmsUserService {
    @Resource
    private UmsUserDao umsUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsUser queryById(Integer id) {
        return this.umsUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsUser> queryByPage(UmsUser umsUser, PageRequest pageRequest) {
        long total = this.umsUserDao.count(umsUser);
        return new PageImpl<>(this.umsUserDao.queryAllByLimit(umsUser, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsUser 实例对象
     * @return 实例对象
     */
    @Override
    public UmsUser insert(UmsUser umsUser) {
        this.umsUserDao.insert(umsUser);
        return umsUser;
    }

    /**
     * 修改数据
     *
     * @param umsUser 实例对象
     * @return 实例对象
     */
    @Override
    public UmsUser update(UmsUser umsUser) {
        this.umsUserDao.update(umsUser);
        return this.queryById(umsUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsUserDao.deleteById(id) > 0;
    }
}
