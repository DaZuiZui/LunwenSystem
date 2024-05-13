package com.demo.lw.controller;

import com.demo.lw.entity.PmsGoverresearch;
import com.demo.lw.service.PmsGoverresearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PmsGoverresearch)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:18:52
 */
@RestController
@RequestMapping("pmsGoverresearch")
public class PmsGoverresearchController {
    /**
     * 服务对象
     */
    @Resource
    private PmsGoverresearchService pmsGoverresearchService;

    /**
     * 分页查询
     *
     * @param pmsGoverresearch 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsGoverresearch>> queryByPage(PmsGoverresearch pmsGoverresearch, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsGoverresearchService.queryByPage(pmsGoverresearch, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsGoverresearch> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.pmsGoverresearchService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsGoverresearch 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsGoverresearch> add(PmsGoverresearch pmsGoverresearch) {
        return ResponseEntity.ok(this.pmsGoverresearchService.insert(pmsGoverresearch));
    }

    /**
     * 编辑数据
     *
     * @param pmsGoverresearch 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsGoverresearch> edit(PmsGoverresearch pmsGoverresearch) {
        return ResponseEntity.ok(this.pmsGoverresearchService.update(pmsGoverresearch));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.pmsGoverresearchService.deleteById(id));
    }

}

