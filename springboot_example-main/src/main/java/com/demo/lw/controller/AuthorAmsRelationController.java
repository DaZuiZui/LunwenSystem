package com.demo.lw.controller;

import com.demo.lw.entity.AuthorAmsRelation;
import com.demo.lw.service.AuthorAmsRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AuthorAmsRelation)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:15:42
 */
@RestController
@RequestMapping("authorAmsRelation")
public class AuthorAmsRelationController {
    /**
     * 服务对象
     */
    @Resource
    private AuthorAmsRelationService authorAmsRelationService;

    /**
     * 分页查询
     *
     * @param authorAmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AuthorAmsRelation>> queryByPage(AuthorAmsRelation authorAmsRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.authorAmsRelationService.queryByPage(authorAmsRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AuthorAmsRelation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.authorAmsRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param authorAmsRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AuthorAmsRelation> add(AuthorAmsRelation authorAmsRelation) {
        return ResponseEntity.ok(this.authorAmsRelationService.insert(authorAmsRelation));
    }

    /**
     * 编辑数据
     *
     * @param authorAmsRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AuthorAmsRelation> edit(AuthorAmsRelation authorAmsRelation) {
        return ResponseEntity.ok(this.authorAmsRelationService.update(authorAmsRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.authorAmsRelationService.deleteById(id));
    }

}

