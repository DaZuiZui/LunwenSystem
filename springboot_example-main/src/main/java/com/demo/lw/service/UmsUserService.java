package com.demo.lw.service;

import com.demo.lw.entity.UmsUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsUser)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:50:41
 */
public interface UmsUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsUser queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsUser> queryByPage(UmsUser umsUser, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsUser 实例对象
     * @return 实例对象
     */
    UmsUser insert(UmsUser umsUser);

    /**
     * 修改数据
     *
     * @param umsUser 实例对象
     * @return 实例对象
     */
    UmsUser update(UmsUser umsUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
