package com.demo.lw.service;

import com.demo.lw.entity.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Author)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 13:15:02
 */
public interface AuthorService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Author queryById(Integer id);

    /**
     * 分页查询
     *
     * @param author 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Author> queryByPage(Author author, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param author 实例对象
     * @return 实例对象
     */
    Author insert(Author author);

    /**
     * 修改数据
     *
     * @param author 实例对象
     * @return 实例对象
     */
    Author update(Author author);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
