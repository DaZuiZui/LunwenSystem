package com.demo.lw.controller;

import com.demo.lw.entity.UmsRoleMenuRelation;
import com.demo.lw.service.UmsRoleMenuRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsRoleMenuRelation)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:29:48
 */
@RestController
@RequestMapping("umsRoleMenuRelation")
public class UmsRoleMenuRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsRoleMenuRelationService umsRoleMenuRelationService;

    /**
     * 分页查询
     *
     * @param umsRoleMenuRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsRoleMenuRelation>> queryByPage(UmsRoleMenuRelation umsRoleMenuRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsRoleMenuRelationService.queryByPage(umsRoleMenuRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsRoleMenuRelation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsRoleMenuRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsRoleMenuRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsRoleMenuRelation> add(UmsRoleMenuRelation umsRoleMenuRelation) {
        return ResponseEntity.ok(this.umsRoleMenuRelationService.insert(umsRoleMenuRelation));
    }

    /**
     * 编辑数据
     *
     * @param umsRoleMenuRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsRoleMenuRelation> edit(UmsRoleMenuRelation umsRoleMenuRelation) {
        return ResponseEntity.ok(this.umsRoleMenuRelationService.update(umsRoleMenuRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsRoleMenuRelationService.deleteById(id));
    }

}

