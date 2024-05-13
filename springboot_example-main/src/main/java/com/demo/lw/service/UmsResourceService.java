package com.demo.lw.service;

import com.demo.lw.entity.UmsResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UmsResource)表服务接口
 *
 * @author 1
 * @since 2024-05-13 13:28:33
 */
public interface UmsResourceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsResource queryById(Integer id);

    /**
     * 分页查询
     *
     * @param umsResource 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsResource> queryByPage(UmsResource umsResource, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsResource 实例对象
     * @return 实例对象
     */
    UmsResource insert(UmsResource umsResource);

    /**
     * 修改数据
     *
     * @param umsResource 实例对象
     * @return 实例对象
     */
    UmsResource update(UmsResource umsResource);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
