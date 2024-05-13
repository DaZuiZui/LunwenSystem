package com.demo.lw.service.impl;

import com.demo.lw.entity.AmsSoftware;
import com.demo.lw.dao.AmsSoftwareDao;
import com.demo.lw.service.AmsSoftwareService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AmsSoftware)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:12:43
 */
@Service("amsSoftwareService")
public class AmsSoftwareServiceImpl implements AmsSoftwareService {
    @Resource
    private AmsSoftwareDao amsSoftwareDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsSoftware queryById(Integer id) {
        return this.amsSoftwareDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param amsSoftware 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AmsSoftware> queryByPage(AmsSoftware amsSoftware, PageRequest pageRequest) {
        long total = this.amsSoftwareDao.count(amsSoftware);
        return new PageImpl<>(this.amsSoftwareDao.queryAllByLimit(amsSoftware, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param amsSoftware 实例对象
     * @return 实例对象
     */
    @Override
    public AmsSoftware insert(AmsSoftware amsSoftware) {
        this.amsSoftwareDao.insert(amsSoftware);
        return amsSoftware;
    }

    /**
     * 修改数据
     *
     * @param amsSoftware 实例对象
     * @return 实例对象
     */
    @Override
    public AmsSoftware update(AmsSoftware amsSoftware) {
        this.amsSoftwareDao.update(amsSoftware);
        return this.queryById(amsSoftware.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsSoftwareDao.deleteById(id) > 0;
    }
}
