package com.demo.lw.service;

import com.demo.lw.entity.AmsSoftware;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AmsSoftware)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:12:43
 */
public interface AmsSoftwareService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsSoftware queryById(Integer id);

    /**
     * 分页查询
     *
     * @param amsSoftware 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AmsSoftware> queryByPage(AmsSoftware amsSoftware, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param amsSoftware 实例对象
     * @return 实例对象
     */
    AmsSoftware insert(AmsSoftware amsSoftware);

    /**
     * 修改数据
     *
     * @param amsSoftware 实例对象
     * @return 实例对象
     */
    AmsSoftware update(AmsSoftware amsSoftware);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
