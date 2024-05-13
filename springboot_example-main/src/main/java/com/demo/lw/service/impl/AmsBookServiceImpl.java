package com.demo.lw.service.impl;

import com.demo.lw.dao.AmsBookDao;
import com.demo.lw.entity.AmsBook;
import com.demo.lw.service.AmsBookService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (AmsBook)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 11:14:59
 */
@Service("amsBookService")
public class AmsBookServiceImpl implements AmsBookService {
    @Resource
    private AmsBookDao amsBookDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AmsBook queryById(Integer id) {
        return this.amsBookDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param amsBook 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AmsBook> queryByPage(AmsBook amsBook, PageRequest pageRequest) {
        long total = this.amsBookDao.count(amsBook);
        return new PageImpl<>(this.amsBookDao.queryAllByLimit(amsBook, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param amsBook 实例对象
     * @return 实例对象
     */
    @Override
    public AmsBook insert(AmsBook amsBook) {
        this.amsBookDao.insert(amsBook);
        return amsBook;
    }

    /**
     * 修改数据
     *
     * @param amsBook 实例对象
     * @return 实例对象
     */
    @Override
    public AmsBook update(AmsBook amsBook) {
        this.amsBookDao.update(amsBook);
        return this.queryById(amsBook.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.amsBookDao.deleteById(id) > 0;
    }
}
