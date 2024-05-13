package com.demo.lw.service.impl;

import com.demo.lw.entity.Author;
import com.demo.lw.dao.AuthorDao;
import com.demo.lw.service.AuthorService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Author)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:15:02
 */
@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
    @Resource
    private AuthorDao authorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Author queryById(Integer id) {
        return this.authorDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param author 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Author> queryByPage(Author author, PageRequest pageRequest) {
        long total = this.authorDao.count(author);
        return new PageImpl<>(this.authorDao.queryAllByLimit(author, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param author 实例对象
     * @return 实例对象
     */
    @Override
    public Author insert(Author author) {
        this.authorDao.insert(author);
        return author;
    }

    /**
     * 修改数据
     *
     * @param author 实例对象
     * @return 实例对象
     */
    @Override
    public Author update(Author author) {
        this.authorDao.update(author);
        return this.queryById(author.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.authorDao.deleteById(id) > 0;
    }
}
