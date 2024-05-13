package com.demo.lw.service.impl;

import com.demo.lw.entity.AmsOthers;
import com.demo.lw.dao.AmsOthersDao;
import com.demo.lw.service.AmsOthersService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AmsOthers)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:05:51
 */
@Service("amsOthersService")
public class AmsOthersServiceImpl implements AmsOthersService {
    @Resource
    private AmsOthersDao amsOthersDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsOthers queryById(Integer id) {
        return this.amsOthersDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param amsOthers 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AmsOthers> queryByPage(AmsOthers amsOthers, PageRequest pageRequest) {
        long total = this.amsOthersDao.count(amsOthers);
        return new PageImpl<>(this.amsOthersDao.queryAllByLimit(amsOthers, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param amsOthers 实例对象
     * @return 实例对象
     */
    @Override
    public AmsOthers insert(AmsOthers amsOthers) {
        this.amsOthersDao.insert(amsOthers);
        return amsOthers;
    }

    /**
     * 修改数据
     *
     * @param amsOthers 实例对象
     * @return 实例对象
     */
    @Override
    public AmsOthers update(AmsOthers amsOthers) {
        this.amsOthersDao.update(amsOthers);
        return this.queryById(amsOthers.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsOthersDao.deleteById(id) > 0;
    }
}
