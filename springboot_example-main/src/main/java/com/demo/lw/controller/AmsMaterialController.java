package com.demo.lw.controller;

import com.demo.lw.entity.AmsMaterial;
import com.demo.lw.service.AmsMaterialService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsMaterial)表控制层
 *
 * @author 1
 * @since 2024-05-13 11:19:31
 */
@RestController
@RequestMapping("amsMaterial")
public class AmsMaterialController {
    /**
     * 服务对象
     */
    @Resource
    private AmsMaterialService amsMaterialService;

    /**
     * 分页查询
     *
     * @param amsMaterial 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AmsMaterial>> queryByPage(AmsMaterial amsMaterial, PageRequest pageRequest) {
        return ResponseEntity.ok(this.amsMaterialService.queryByPage(amsMaterial, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AmsMaterial> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.amsMaterialService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param amsMaterial 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AmsMaterial> add(AmsMaterial amsMaterial) {
        return ResponseEntity.ok(this.amsMaterialService.insert(amsMaterial));
    }

    /**
     * 编辑数据
     *
     * @param amsMaterial 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AmsMaterial> edit(AmsMaterial amsMaterial) {
        return ResponseEntity.ok(this.amsMaterialService.update(amsMaterial));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.amsMaterialService.deleteById(id));
    }

}

