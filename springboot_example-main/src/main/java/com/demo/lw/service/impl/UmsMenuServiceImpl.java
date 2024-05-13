package com.demo.lw.service.impl;

import com.demo.lw.entity.UmsMenu;
import com.demo.lw.dao.UmsMenuDao;
import com.demo.lw.service.UmsMenuService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UmsMenu)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 13:26:02
 */
@Service("umsMenuService")
public class UmsMenuServiceImpl implements UmsMenuService {
    @Resource
    private UmsMenuDao umsMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMenu queryById(Integer id) {
        return this.umsMenuDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsMenu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsMenu> queryByPage(UmsMenu umsMenu, PageRequest pageRequest) {
        long total = this.umsMenuDao.count(umsMenu);
        return new PageImpl<>(this.umsMenuDao.queryAllByLimit(umsMenu, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsMenu 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMenu insert(UmsMenu umsMenu) {
        this.umsMenuDao.insert(umsMenu);
        return umsMenu;
    }

    /**
     * 修改数据
     *
     * @param umsMenu 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMenu update(UmsMenu umsMenu) {
        this.umsMenuDao.update(umsMenu);
        return this.queryById(umsMenu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.umsMenuDao.deleteById(id) > 0;
    }
}
