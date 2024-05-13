package com.demo.lw.service.impl;

import com.demo.lw.entity.AmsReport;
import com.demo.lw.dao.AmsReportDao;
import com.demo.lw.service.AmsReportService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AmsReport)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:10:41
 */
@Service("amsReportService")
public class AmsReportServiceImpl implements AmsReportService {
    @Resource
    private AmsReportDao amsReportDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsReport queryById(Integer id) {
        return this.amsReportDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param amsReport 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AmsReport> queryByPage(AmsReport amsReport, PageRequest pageRequest) {
        long total = this.amsReportDao.count(amsReport);
        return new PageImpl<>(this.amsReportDao.queryAllByLimit(amsReport, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param amsReport 实例对象
     * @return 实例对象
     */
    @Override
    public AmsReport insert(AmsReport amsReport) {
        this.amsReportDao.insert(amsReport);
        return amsReport;
    }

    /**
     * 修改数据
     *
     * @param amsReport 实例对象
     * @return 实例对象
     */
    @Override
    public AmsReport update(AmsReport amsReport) {
        this.amsReportDao.update(amsReport);
        return this.queryById(amsReport.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsReportDao.deleteById(id) > 0;
    }
}
