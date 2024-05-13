package com.demo.lw.service;

import com.demo.lw.entity.AmsPaper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AmsPaper)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:07:07
 */
public interface AmsPaperService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsPaper queryById(Integer id);

    /**
     * 分页查询
     *
     * @param amsPaper 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AmsPaper> queryByPage(AmsPaper amsPaper, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param amsPaper 实例对象
     * @return 实例对象
     */
    AmsPaper insert(AmsPaper amsPaper);

    /**
     * 修改数据
     *
     * @param amsPaper 实例对象
     * @return 实例对象
     */
    AmsPaper update(AmsPaper amsPaper);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
