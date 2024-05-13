package com.demo.lw.service;

import com.demo.lw.entity.AmsOthers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AmsOthers)表服务接口
 *
 * @author 1
 * @since 2024-05-13 13:05:51
 */
public interface AmsOthersService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsOthers queryById(Integer id);

    /**
     * 分页查询
     *
     * @param amsOthers 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AmsOthers> queryByPage(AmsOthers amsOthers, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param amsOthers 实例对象
     * @return 实例对象
     */
    AmsOthers insert(AmsOthers amsOthers);

    /**
     * 修改数据
     *
     * @param amsOthers 实例对象
     * @return 实例对象
     */
    AmsOthers update(AmsOthers amsOthers);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
