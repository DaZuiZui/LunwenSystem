package com.demo.lw.service;

import com.demo.lw.entity.UmsMenu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsMenu)表服务接口
 *
 * @author 1
 * @since 2024-05-13 13:26:02
 */
public interface UmsMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMenu queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsMenu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsMenu> queryByPage(UmsMenu umsMenu, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsMenu 实例对象
     * @return 实例对象
     */
    UmsMenu insert(UmsMenu umsMenu);

    /**
     * 修改数据
     *
     * @param umsMenu 实例对象
     * @return 实例对象
     */
    UmsMenu update(UmsMenu umsMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
