package com.demo.lw.service.impl;

import com.demo.lw.entity.AmsCertificate;
import com.demo.lw.dao.AmsCertificateDao;
import com.demo.lw.service.AmsCertificateService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AmsCertificate)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 11:17:43
 */
@Service("amsCertificateService")
public class AmsCertificateServiceImpl implements AmsCertificateService {
    @Resource
    private AmsCertificateDao amsCertificateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsCertificate queryById(Integer id) {
        return this.amsCertificateDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param amsCertificate 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AmsCertificate> queryByPage(AmsCertificate amsCertificate, PageRequest pageRequest) {
        long total = this.amsCertificateDao.count(amsCertificate);
        return new PageImpl<>(this.amsCertificateDao.queryAllByLimit(amsCertificate, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param amsCertificate 实例对象
     * @return 实例对象
     */
    @Override
    public AmsCertificate insert(AmsCertificate amsCertificate) {
        this.amsCertificateDao.insert(amsCertificate);
        return amsCertificate;
    }

    /**
     * 修改数据
     *
     * @param amsCertificate 实例对象
     * @return 实例对象
     */
    @Override
    public AmsCertificate update(AmsCertificate amsCertificate) {
        this.amsCertificateDao.update(amsCertificate);
        return this.queryById(amsCertificate.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsCertificateDao.deleteById(id) > 0;
    }
}
