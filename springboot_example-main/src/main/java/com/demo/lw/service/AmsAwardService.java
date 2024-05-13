package com.demo.lw.service;

import com.demo.lw.entity.AmsAward;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AmsAward)表服务接口
 *
 * @author 1
 * @since 2024-05-13 11:08:19
 */
public interface AmsAwardService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsAward queryById(Integer id);

    /**
     * 分页查询
     *
     * @param amsAward 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AmsAward> queryByPage(AmsAward amsAward, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param amsAward 实例对象
     * @return 实例对象
     */
    AmsAward insert(AmsAward amsAward);

    /**
     * 修改数据
     *
     * @param amsAward 实例对象
     * @return 实例对象
     */
    AmsAward update(AmsAward amsAward);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
