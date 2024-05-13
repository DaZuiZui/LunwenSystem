package com.demo.lw.service.impl;

import com.demo.lw.entity.PmsGoverresearch;
import com.demo.lw.dao.PmsGoverresearchDao;
import com.demo.lw.service.PmsGoverresearchService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (PmsGoverresearch)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:18:52
 */
@Service("pmsGoverresearchService")
public class PmsGoverresearchServiceImpl implements PmsGoverresearchService {
    @Resource
    private PmsGoverresearchDao pmsGoverresearchDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsGoverresearch queryById(Integer id) {
        return this.pmsGoverresearchDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsGoverresearch 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsGoverresearch> queryByPage(PmsGoverresearch pmsGoverresearch, PageRequest pageRequest) {
        long total = this.pmsGoverresearchDao.count(pmsGoverresearch);
        return new PageImpl<>(this.pmsGoverresearchDao.queryAllByLimit(pmsGoverresearch, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsGoverresearch 实例对象
     * @return 实例对象
     */
    @Override
    public PmsGoverresearch insert(PmsGoverresearch pmsGoverresearch) {
        this.pmsGoverresearchDao.insert(pmsGoverresearch);
        return pmsGoverresearch;
    }

    /**
     * 修改数据
     *
     * @param pmsGoverresearch 实例对象
     * @return 实例对象
     */
    @Override
    public PmsGoverresearch update(PmsGoverresearch pmsGoverresearch) {
        this.pmsGoverresearchDao.update(pmsGoverresearch);
        return this.queryById(pmsGoverresearch.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.pmsGoverresearchDao.deleteById(id) > 0;
    }
}
