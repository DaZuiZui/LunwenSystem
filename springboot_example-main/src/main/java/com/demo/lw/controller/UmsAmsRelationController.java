package com.demo.lw.controller;

import com.demo.lw.entity.UmsAmsRelation;
import com.demo.lw.service.UmsAmsRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsAmsRelation)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:24:53
 */
@RestController
@RequestMapping("umsAmsRelation")
public class UmsAmsRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsAmsRelationService umsAmsRelationService;

    /**
     * 分页查询
     *
     * @param umsAmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsAmsRelation>> queryByPage(UmsAmsRelation umsAmsRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsAmsRelationService.queryByPage(umsAmsRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsAmsRelation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsAmsRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsAmsRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsAmsRelation> add(UmsAmsRelation umsAmsRelation) {
        return ResponseEntity.ok(this.umsAmsRelationService.insert(umsAmsRelation));
    }

    /**
     * 编辑数据
     *
     * @param umsAmsRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsAmsRelation> edit(UmsAmsRelation umsAmsRelation) {
        return ResponseEntity.ok(this.umsAmsRelationService.update(umsAmsRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsAmsRelationService.deleteById(id));
    }

}

