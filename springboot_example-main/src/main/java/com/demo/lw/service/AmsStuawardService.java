package com.demo.lw.service;

import com.demo.lw.entity.AmsStuaward;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AmsStuaward)表服务接口
 *
 * @author 1
 * @since 2024-05-13 13:13:23
 */
public interface AmsStuawardService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsStuaward queryById(Integer id);

    /**
     * 分页查询
     *
     * @param amsStuaward 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AmsStuaward> queryByPage(AmsStuaward amsStuaward, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param amsStuaward 实例对象
     * @return 实例对象
     */
    AmsStuaward insert(AmsStuaward amsStuaward);

    /**
     * 修改数据
     *
     * @param amsStuaward 实例对象
     * @return 实例对象
     */
    AmsStuaward update(AmsStuaward amsStuaward);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
