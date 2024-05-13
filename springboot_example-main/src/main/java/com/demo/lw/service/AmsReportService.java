package com.demo.lw.service;

import com.demo.lw.entity.AmsReport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AmsReport)表服务接口
 *
 * @author 1
 * @since 2024-05-13 13:10:41
 */
public interface AmsReportService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsReport queryById(Integer id);

    /**
     * 分页查询
     *
     * @param amsReport 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AmsReport> queryByPage(AmsReport amsReport, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param amsReport 实例对象
     * @return 实例对象
     */
    AmsReport insert(AmsReport amsReport);

    /**
     * 修改数据
     *
     * @param amsReport 实例对象
     * @return 实例对象
     */
    AmsReport update(AmsReport amsReport);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
