package com.demo.lw.controller;

import com.demo.lw.entity.PmsResearch;
import com.demo.lw.service.PmsResearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PmsResearch)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:24:10
 */
@RestController
@RequestMapping("pmsResearch")
public class PmsResearchController {
    /**
     * 服务对象
     */
    @Resource
    private PmsResearchService pmsResearchService;

    /**
     * 分页查询
     *
     * @param pmsResearch 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsResearch>> queryByPage(PmsResearch pmsResearch, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsResearchService.queryByPage(pmsResearch, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsResearch> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.pmsResearchService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsResearch 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsResearch> add(PmsResearch pmsResearch) {
        return ResponseEntity.ok(this.pmsResearchService.insert(pmsResearch));
    }

    /**
     * 编辑数据
     *
     * @param pmsResearch 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsResearch> edit(PmsResearch pmsResearch) {
        return ResponseEntity.ok(this.pmsResearchService.update(pmsResearch));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.pmsResearchService.deleteById(id));
    }

}

