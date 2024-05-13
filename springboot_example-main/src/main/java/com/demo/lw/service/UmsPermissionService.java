package com.demo.lw.service;

import com.demo.lw.entity.UmsPermission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsPermission)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:26:53
 */
public interface UmsPermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsPermission queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsPermission 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsPermission> queryByPage(UmsPermission umsPermission, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    UmsPermission insert(UmsPermission umsPermission);

    /**
     * 修改数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    UmsPermission update(UmsPermission umsPermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
