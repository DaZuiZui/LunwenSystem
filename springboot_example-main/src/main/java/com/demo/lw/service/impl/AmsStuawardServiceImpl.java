package com.demo.lw.service.impl;

import com.demo.lw.entity.AmsStuaward;
import com.demo.lw.dao.AmsStuawardDao;
import com.demo.lw.service.AmsStuawardService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AmsStuaward)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:13:23
 */
@Service("amsStuawardService")
public class AmsStuawardServiceImpl implements AmsStuawardService {
    @Resource
    private AmsStuawardDao amsStuawardDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsStuaward queryById(Integer id) {
        return this.amsStuawardDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param amsStuaward 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AmsStuaward> queryByPage(AmsStuaward amsStuaward, PageRequest pageRequest) {
        long total = this.amsStuawardDao.count(amsStuaward);
        return new PageImpl<>(this.amsStuawardDao.queryAllByLimit(amsStuaward, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param amsStuaward 实例对象
     * @return 实例对象
     */
    @Override
    public AmsStuaward insert(AmsStuaward amsStuaward) {
        this.amsStuawardDao.insert(amsStuaward);
        return amsStuaward;
    }

    /**
     * 修改数据
     *
     * @param amsStuaward 实例对象
     * @return 实例对象
     */
    @Override
    public AmsStuaward update(AmsStuaward amsStuaward) {
        this.amsStuawardDao.update(amsStuaward);
        return this.queryById(amsStuaward.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsStuawardDao.deleteById(id) > 0;
    }
}
