package com.demo.lw.service;

import com.demo.lw.entity.PmsResearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (PmsResearch)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:24:10
 */
public interface PmsResearchService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsResearch queryById(Integer id);

    /**
     * 分页查询
     *
     * @param pmsResearch 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsResearch> queryByPage(PmsResearch pmsResearch, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsResearch 实例对象
     * @return 实例对象
     */
    PmsResearch insert(PmsResearch pmsResearch);

    /**
     * 修改数据
     *
     * @param pmsResearch 实例对象
     * @return 实例对象
     */
    PmsResearch update(PmsResearch pmsResearch);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
