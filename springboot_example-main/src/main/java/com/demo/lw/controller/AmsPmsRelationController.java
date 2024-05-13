package com.demo.lw.controller;

import com.demo.lw.entity.AmsPmsRelation;
import com.demo.lw.service.AmsPmsRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsPmsRelation)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:09:31
 */
@RestController
@RequestMapping("amsPmsRelation")
public class AmsPmsRelationController {
    /**
     * 服务对象
     */
    @Resource
    private AmsPmsRelationService amsPmsRelationService;

    /**
     * 分页查询
     *
     * @param amsPmsRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AmsPmsRelation>> queryByPage(AmsPmsRelation amsPmsRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.amsPmsRelationService.queryByPage(amsPmsRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AmsPmsRelation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.amsPmsRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param amsPmsRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AmsPmsRelation> add(AmsPmsRelation amsPmsRelation) {
        return ResponseEntity.ok(this.amsPmsRelationService.insert(amsPmsRelation));
    }

    /**
     * 编辑数据
     *
     * @param amsPmsRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AmsPmsRelation> edit(AmsPmsRelation amsPmsRelation) {
        return ResponseEntity.ok(this.amsPmsRelationService.update(amsPmsRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.amsPmsRelationService.deleteById(id));
    }

}

