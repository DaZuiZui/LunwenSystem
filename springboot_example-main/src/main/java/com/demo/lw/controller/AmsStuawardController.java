package com.demo.lw.controller;

import com.demo.lw.entity.AmsStuaward;
import com.demo.lw.service.AmsStuawardService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsStuaward)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:13:23
 */
@RestController
@RequestMapping("amsStuaward")
public class AmsStuawardController {
    /**
     * 服务对象
     */
    @Resource
    private AmsStuawardService amsStuawardService;

    /**
     * 分页查询
     *
     * @param amsStuaward 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AmsStuaward>> queryByPage(AmsStuaward amsStuaward, PageRequest pageRequest) {
        return ResponseEntity.ok(this.amsStuawardService.queryByPage(amsStuaward, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AmsStuaward> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.amsStuawardService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param amsStuaward 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AmsStuaward> add(AmsStuaward amsStuaward) {
        return ResponseEntity.ok(this.amsStuawardService.insert(amsStuaward));
    }

    /**
     * 编辑数据
     *
     * @param amsStuaward 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AmsStuaward> edit(AmsStuaward amsStuaward) {
        return ResponseEntity.ok(this.amsStuawardService.update(amsStuaward));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.amsStuawardService.deleteById(id));
    }

}

