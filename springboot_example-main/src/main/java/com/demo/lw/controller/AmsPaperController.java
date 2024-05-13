package com.demo.lw.controller;

import com.demo.lw.entity.AmsPaper;
import com.demo.lw.service.AmsPaperService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsPaper)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:07:07
 */
@RestController
@RequestMapping("amsPaper")
public class AmsPaperController {
    /**
     * 服务对象
     */
    @Resource
    private AmsPaperService amsPaperService;

    /**
     * 分页查询
     *
     * @param amsPaper 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AmsPaper>> queryByPage(AmsPaper amsPaper, PageRequest pageRequest) {
        return ResponseEntity.ok(this.amsPaperService.queryByPage(amsPaper, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AmsPaper> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.amsPaperService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param amsPaper 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AmsPaper> add(AmsPaper amsPaper) {
        return ResponseEntity.ok(this.amsPaperService.insert(amsPaper));
    }

    /**
     * 编辑数据
     *
     * @param amsPaper 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AmsPaper> edit(AmsPaper amsPaper) {
        return ResponseEntity.ok(this.amsPaperService.update(amsPaper));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.amsPaperService.deleteById(id));
    }

}

