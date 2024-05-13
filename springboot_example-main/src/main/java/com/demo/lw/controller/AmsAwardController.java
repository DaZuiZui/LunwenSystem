package com.demo.lw.controller;

import com.demo.lw.entity.AmsAward;
import com.demo.lw.service.AmsAwardService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsAward)表控制层
 *
 * @author makejava
 * @since 2024-05-13 11:08:19
 */
@RestController
@RequestMapping("amsAward")
public class AmsAwardController {
    /**
     * 服务对象
     */
    @Resource
    private AmsAwardService amsAwardService;

    /**
     * 分页查询
     *
     * @param amsAward 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AmsAward>> queryByPage(AmsAward amsAward, PageRequest pageRequest) {
        return ResponseEntity.ok(this.amsAwardService.queryByPage(amsAward, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AmsAward> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.amsAwardService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param amsAward 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AmsAward> add(AmsAward amsAward) {
        return ResponseEntity.ok(this.amsAwardService.insert(amsAward));
    }

    /**
     * 编辑数据
     *
     * @param amsAward 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AmsAward> edit(AmsAward amsAward) {
        return ResponseEntity.ok(this.amsAwardService.update(amsAward));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.amsAwardService.deleteById(id));
    }

}

