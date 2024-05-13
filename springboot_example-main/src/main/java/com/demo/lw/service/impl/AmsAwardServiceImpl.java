package com.demo.lw.service.impl;

import com.demo.lw.dao.AmsAwardDao;
import com.demo.lw.entity.AmsAward;
import com.demo.lw.service.AmsAwardService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AmsAward)表服务实现类
 *
 * @author 1
 * @since 2024-05-13 11:08:19
 */
@Service("amsAwardService")
public class AmsAwardServiceImpl implements AmsAwardService {
    @Resource
    private AmsAwardDao amsAwardDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsAward queryById(Integer id) {
        return this.amsAwardDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param amsAward 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AmsAward> queryByPage(AmsAward amsAward, PageRequest pageRequest) {
        long total = this.amsAwardDao.count(amsAward);
        return new PageImpl<>(this.amsAwardDao.queryAllByLimit(amsAward, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param amsAward 实例对象
     * @return 实例对象
     */
    @Override
    public AmsAward insert(AmsAward amsAward) {
        this.amsAwardDao.insert(amsAward);
        return amsAward;
    }

    /**
     * 修改数据
     *
     * @param amsAward 实例对象
     * @return 实例对象
     */
    @Override
    public AmsAward update(AmsAward amsAward) {
        this.amsAwardDao.update(amsAward);
        return this.queryById(amsAward.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsAwardDao.deleteById(id) > 0;
    }
}
