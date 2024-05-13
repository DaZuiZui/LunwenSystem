package com.demo.lw.controller;

import com.demo.lw.entity.AmsBook;
import com.demo.lw.service.AmsBookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsBook)表控制层
 *
 * @author makejava
 * @since 2024-05-13 11:14:59
 */
@RestController
@RequestMapping("amsBook")
public class AmsBookController {
    /**
     * 服务对象
     */
    @Resource
    private AmsBookService amsBookService;

    /**
     * 分页查询
     *
     * @param amsBook 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AmsBook>> queryByPage(AmsBook amsBook, PageRequest pageRequest) {
        return ResponseEntity.ok(this.amsBookService.queryByPage(amsBook, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AmsBook> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.amsBookService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param amsBook 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AmsBook> add(AmsBook amsBook) {
        return ResponseEntity.ok(this.amsBookService.insert(amsBook));
    }

    /**
     * 编辑数据
     *
     * @param amsBook 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AmsBook> edit(AmsBook amsBook) {
        return ResponseEntity.ok(this.amsBookService.update(amsBook));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.amsBookService.deleteById(id));
    }

}

