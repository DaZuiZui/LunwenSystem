package com.demo.lw.controller;

import com.demo.lw.entity.UmsUserRoleRelation;
import com.demo.lw.service.UmsUserRoleRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsUserRoleRelation)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:52:57
 */
@RestController
@RequestMapping("umsUserRoleRelation")
public class UmsUserRoleRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsUserRoleRelationService umsUserRoleRelationService;

    /**
     * 分页查询
     *
     * @param umsUserRoleRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsUserRoleRelation>> queryByPage(UmsUserRoleRelation umsUserRoleRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsUserRoleRelationService.queryByPage(umsUserRoleRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsUserRoleRelation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsUserRoleRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsUserRoleRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsUserRoleRelation> add(UmsUserRoleRelation umsUserRoleRelation) {
        return ResponseEntity.ok(this.umsUserRoleRelationService.insert(umsUserRoleRelation));
    }

    /**
     * 编辑数据
     *
     * @param umsUserRoleRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsUserRoleRelation> edit(UmsUserRoleRelation umsUserRoleRelation) {
        return ResponseEntity.ok(this.umsUserRoleRelationService.update(umsUserRoleRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsUserRoleRelationService.deleteById(id));
    }

}

