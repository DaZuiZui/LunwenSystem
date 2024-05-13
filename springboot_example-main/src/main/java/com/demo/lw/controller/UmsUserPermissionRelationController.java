package com.demo.lw.controller;

import com.demo.lw.entity.UmsUserPermissionRelation;
import com.demo.lw.service.UmsUserPermissionRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsUserPermissionRelation)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:51:27
 */
@RestController
@RequestMapping("umsUserPermissionRelation")
public class UmsUserPermissionRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsUserPermissionRelationService umsUserPermissionRelationService;

    /**
     * 分页查询
     *
     * @param umsUserPermissionRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsUserPermissionRelation>> queryByPage(UmsUserPermissionRelation umsUserPermissionRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsUserPermissionRelationService.queryByPage(umsUserPermissionRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsUserPermissionRelation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsUserPermissionRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsUserPermissionRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsUserPermissionRelation> add(UmsUserPermissionRelation umsUserPermissionRelation) {
        return ResponseEntity.ok(this.umsUserPermissionRelationService.insert(umsUserPermissionRelation));
    }

    /**
     * 编辑数据
     *
     * @param umsUserPermissionRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsUserPermissionRelation> edit(UmsUserPermissionRelation umsUserPermissionRelation) {
        return ResponseEntity.ok(this.umsUserPermissionRelationService.update(umsUserPermissionRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsUserPermissionRelationService.deleteById(id));
    }

}

