package com.demo.lw.service;

import com.demo.lw.entity.AmsBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AmsBook)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 11:14:59
 */
public interface AmsBookService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsBook queryById(Integer id);

    /**
     * 分页查询
     *
     * @param amsBook 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AmsBook> queryByPage(AmsBook amsBook, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param amsBook 实例对象
     * @return 实例对象
     */
    AmsBook insert(AmsBook amsBook);

    /**
     * 修改数据
     *
     * @param amsBook 实例对象
     * @return 实例对象
     */
    AmsBook update(AmsBook amsBook);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
