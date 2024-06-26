package com.demo.lw.controller;

import com.demo.lw.entity.AuthorPmsRelation;
import com.demo.lw.service.AuthorPmsRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AuthorPmsRelation)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:17:30
 */
@RestController
@RequestMapping("authorPmsRelation")
public class AuthorPmsRelationController {
    /**
     * 服务对象
     */
    @Resource
    private AuthorPmsRelationService authorPmsRelationService;

    /**
     * 分页查询
     *
     * @param authorPmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AuthorPmsRelation>> queryByPage(AuthorPmsRelation authorPmsRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.authorPmsRelationService.queryByPage(authorPmsRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AuthorPmsRelation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.authorPmsRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param authorPmsRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AuthorPmsRelation> add(AuthorPmsRelation authorPmsRelation) {
        return ResponseEntity.ok(this.authorPmsRelationService.insert(authorPmsRelation));
    }

    /**
     * 编辑数据
     *
     * @param authorPmsRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AuthorPmsRelation> edit(AuthorPmsRelation authorPmsRelation) {
        return ResponseEntity.ok(this.authorPmsRelationService.update(authorPmsRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.authorPmsRelationService.deleteById(id));
    }

}

