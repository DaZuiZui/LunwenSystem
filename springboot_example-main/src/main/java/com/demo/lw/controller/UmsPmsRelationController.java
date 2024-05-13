package com.demo.lw.controller;

import com.demo.lw.entity.UmsPmsRelation;
import com.demo.lw.service.UmsPmsRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsPmsRelation)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:27:42
 */
@RestController
@RequestMapping("umsPmsRelation")
public class UmsPmsRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsPmsRelationService umsPmsRelationService;

    /**
     * 分页查询
     *
     * @param umsPmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsPmsRelation>> queryByPage(UmsPmsRelation umsPmsRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsPmsRelationService.queryByPage(umsPmsRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsPmsRelation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsPmsRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsPmsRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsPmsRelation> add(UmsPmsRelation umsPmsRelation) {
        return ResponseEntity.ok(this.umsPmsRelationService.insert(umsPmsRelation));
    }

    /**
     * 编辑数据
     *
     * @param umsPmsRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsPmsRelation> edit(UmsPmsRelation umsPmsRelation) {
        return ResponseEntity.ok(this.umsPmsRelationService.update(umsPmsRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsPmsRelationService.deleteById(id));
    }

}

