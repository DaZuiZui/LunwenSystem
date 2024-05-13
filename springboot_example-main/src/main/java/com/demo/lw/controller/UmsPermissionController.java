package com.demo.lw.controller;

import com.demo.lw.entity.UmsPermission;
import com.demo.lw.service.UmsPermissionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsPermission)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:26:53
 */
@RestController
@RequestMapping("umsPermission")
public class UmsPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private UmsPermissionService umsPermissionService;

    /**
     * 分页查询
     *
     * @param umsPermission 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsPermission>> queryByPage(UmsPermission umsPermission, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsPermissionService.queryByPage(umsPermission, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsPermission> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsPermissionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsPermission 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsPermission> add(UmsPermission umsPermission) {
        return ResponseEntity.ok(this.umsPermissionService.insert(umsPermission));
    }

    /**
     * 编辑数据
     *
     * @param umsPermission 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsPermission> edit(UmsPermission umsPermission) {
        return ResponseEntity.ok(this.umsPermissionService.update(umsPermission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsPermissionService.deleteById(id));
    }

}

