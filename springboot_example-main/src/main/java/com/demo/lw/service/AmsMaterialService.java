package com.demo.lw.service;

import com.demo.lw.entity.AmsMaterial;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AmsMaterial)表服务接口
 *
 * @author 1
 * @since 2024-05-13 11:19:31
 */
public interface AmsMaterialService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsMaterial queryById(Integer id);

    /**
     * 分页查询
     *
     * @param amsMaterial 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AmsMaterial> queryByPage(AmsMaterial amsMaterial, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param amsMaterial 实例对象
     * @return 实例对象
     */
    AmsMaterial insert(AmsMaterial amsMaterial);

    /**
     * 修改数据
     *
     * @param amsMaterial 实例对象
     * @return 实例对象
     */
    AmsMaterial update(AmsMaterial amsMaterial);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
