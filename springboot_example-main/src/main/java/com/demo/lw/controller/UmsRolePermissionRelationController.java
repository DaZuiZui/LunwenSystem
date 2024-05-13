package com.demo.lw.controller;

import com.demo.lw.entity.UmsRolePermissionRelation;
import com.demo.lw.service.UmsRolePermissionRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsRolePermissionRelation)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:30:47
 */
@RestController
@RequestMapping("umsRolePermissionRelation")
public class UmsRolePermissionRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsRolePermissionRelationService umsRolePermissionRelationService;

    /**
     * 分页查询
     *
     * @param umsRolePermissionRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsRolePermissionRelation>> queryByPage(UmsRolePermissionRelation umsRolePermissionRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsRolePermissionRelationService.queryByPage(umsRolePermissionRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsRolePermissionRelation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsRolePermissionRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsRolePermissionRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsRolePermissionRelation> add(UmsRolePermissionRelation umsRolePermissionRelation) {
        return ResponseEntity.ok(this.umsRolePermissionRelationService.insert(umsRolePermissionRelation));
    }

    /**
     * 编辑数据
     *
     * @param umsRolePermissionRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsRolePermissionRelation> edit(UmsRolePermissionRelation umsRolePermissionRelation) {
        return ResponseEntity.ok(this.umsRolePermissionRelationService.update(umsRolePermissionRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsRolePermissionRelationService.deleteById(id));
    }

}

