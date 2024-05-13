package com.demo.lw.controller;

import com.demo.lw.entity.AmsSoftware;
import com.demo.lw.service.AmsSoftwareService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsSoftware)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:12:43
 */
@RestController
@RequestMapping("amsSoftware")
public class AmsSoftwareController {
    /**
     * 服务对象
     */
    @Resource
    private AmsSoftwareService amsSoftwareService;

    /**
     * 分页查询
     *
     * @param amsSoftware 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AmsSoftware>> queryByPage(AmsSoftware amsSoftware, PageRequest pageRequest) {
        return ResponseEntity.ok(this.amsSoftwareService.queryByPage(amsSoftware, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AmsSoftware> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.amsSoftwareService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param amsSoftware 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AmsSoftware> add(AmsSoftware amsSoftware) {
        return ResponseEntity.ok(this.amsSoftwareService.insert(amsSoftware));
    }

    /**
     * 编辑数据
     *
     * @param amsSoftware 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AmsSoftware> edit(AmsSoftware amsSoftware) {
        return ResponseEntity.ok(this.amsSoftwareService.update(amsSoftware));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.amsSoftwareService.deleteById(id));
    }

}

