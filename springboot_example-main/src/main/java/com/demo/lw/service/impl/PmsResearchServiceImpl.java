package com.demo.lw.service.impl;

import com.demo.lw.entity.PmsResearch;
import com.demo.lw.dao.PmsResearchDao;
import com.demo.lw.service.PmsResearchService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (PmsResearch)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 13:24:10
 */
@Service("pmsResearchService")
public class PmsResearchServiceImpl implements PmsResearchService {
    @Resource
    private PmsResearchDao pmsResearchDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsResearch queryById(Integer id) {
        return this.pmsResearchDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsResearch 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsResearch> queryByPage(PmsResearch pmsResearch, PageRequest pageRequest) {
        long total = this.pmsResearchDao.count(pmsResearch);
        return new PageImpl<>(this.pmsResearchDao.queryAllByLimit(pmsResearch, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsResearch 实例对象
     * @return 实例对象
     */
    @Override
    public PmsResearch insert(PmsResearch pmsResearch) {
        this.pmsResearchDao.insert(pmsResearch);
        return pmsResearch;
    }

    /**
     * 修改数据
     *
     * @param pmsResearch 实例对象
     * @return 实例对象
     */
    @Override
    public PmsResearch update(PmsResearch pmsResearch) {
        this.pmsResearchDao.update(pmsResearch);
        return this.queryById(pmsResearch.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.pmsResearchDao.deleteById(id) > 0;
    }
}
