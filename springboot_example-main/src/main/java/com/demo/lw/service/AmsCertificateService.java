package com.demo.lw.service;

import com.demo.lw.entity.AmsCertificate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (AmsCertificate)表服务接口
 *
 * @author 1
 * @since 2024-05-13 11:17:43
 */
public interface AmsCertificateService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsCertificate queryById(Integer id);

    /**
     * 分页查询
     *
     * @param amsCertificate 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AmsCertificate> queryByPage(AmsCertificate amsCertificate, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param amsCertificate 实例对象
     * @return 实例对象
     */
    AmsCertificate insert(AmsCertificate amsCertificate);

    /**
     * 修改数据
     *
     * @param amsCertificate 实例对象
     * @return 实例对象
     */
    AmsCertificate update(AmsCertificate amsCertificate);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
