package com.demo.lw.controller;

import com.demo.lw.entity.Author;
import com.demo.lw.service.AuthorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Author)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:15:02
 */
@RestController
@RequestMapping("author")
public class AuthorController {
    /**
     * 服务对象
     */
    @Resource
    private AuthorService authorService;

    /**
     * 分页查询
     *
     * @param author 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Author>> queryByPage(Author author, PageRequest pageRequest) {
        return ResponseEntity.ok(this.authorService.queryByPage(author, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Author> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.authorService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param author 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Author> add(Author author) {
        return ResponseEntity.ok(this.authorService.insert(author));
    }

    /**
     * 编辑数据
     *
     * @param author 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Author> edit(Author author) {
        return ResponseEntity.ok(this.authorService.update(author));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.authorService.deleteById(id));
    }

}

