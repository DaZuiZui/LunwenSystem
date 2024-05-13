package com.demo.lw.service.impl;

import com.demo.lw.entity.AmsPaper;
import com.demo.lw.dao.AmsPaperDao;
import com.demo.lw.service.AmsPaperService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AmsPaper)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:07:07
 */
@Service("amsPaperService")
public class AmsPaperServiceImpl implements AmsPaperService {
    @Resource
    private AmsPaperDao amsPaperDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsPaper queryById(Integer id) {
        return this.amsPaperDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param amsPaper 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AmsPaper> queryByPage(AmsPaper amsPaper, PageRequest pageRequest) {
        long total = this.amsPaperDao.count(amsPaper);
        return new PageImpl<>(this.amsPaperDao.queryAllByLimit(amsPaper, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param amsPaper 实例对象
     * @return 实例对象
     */
    @Override
    public AmsPaper insert(AmsPaper amsPaper) {
        this.amsPaperDao.insert(amsPaper);
        return amsPaper;
    }

    /**
     * 修改数据
     *
     * @param amsPaper 实例对象
     * @return 实例对象
     */
    @Override
    public AmsPaper update(AmsPaper amsPaper) {
        this.amsPaperDao.update(amsPaper);
        return this.queryById(amsPaper.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsPaperDao.deleteById(id) > 0;
    }
}
