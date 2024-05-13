package com.demo.lw.service.impl;

import com.demo.lw.entity.AmsMaterial;
import com.demo.lw.dao.AmsMaterialDao;
import com.demo.lw.service.AmsMaterialService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AmsMaterial)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 11:19:31
 */
@Service("amsMaterialService")
public class AmsMaterialServiceImpl implements AmsMaterialService {
    @Resource
    private AmsMaterialDao amsMaterialDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsMaterial queryById(Integer id) {
        return this.amsMaterialDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param amsMaterial 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AmsMaterial> queryByPage(AmsMaterial amsMaterial, PageRequest pageRequest) {
        long total = this.amsMaterialDao.count(amsMaterial);
        return new PageImpl<>(this.amsMaterialDao.queryAllByLimit(amsMaterial, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param amsMaterial 实例对象
     * @return 实例对象
     */
    @Override
    public AmsMaterial insert(AmsMaterial amsMaterial) {
        this.amsMaterialDao.insert(amsMaterial);
        return amsMaterial;
    }

    /**
     * 修改数据
     *
     * @param amsMaterial 实例对象
     * @return 实例对象
     */
    @Override
    public AmsMaterial update(AmsMaterial amsMaterial) {
        this.amsMaterialDao.update(amsMaterial);
        return this.queryById(amsMaterial.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsMaterialDao.deleteById(id) > 0;
    }
}
