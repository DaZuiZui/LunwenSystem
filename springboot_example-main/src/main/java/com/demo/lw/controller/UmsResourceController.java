package com.demo.lw.controller;

import com.demo.lw.entity.UmsResource;
import com.demo.lw.service.UmsResourceService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsResource)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:28:33
 */
@RestController
@RequestMapping("umsResource")
public class UmsResourceController {
    /**
     * 服务对象
     */
    @Resource
    private UmsResourceService umsResourceService;

    /**
     * 分页查询
     *
     * @param umsResource 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsResource>> queryByPage(UmsResource umsResource, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsResourceService.queryByPage(umsResource, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsResource> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsResourceService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsResource 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsResource> add(UmsResource umsResource) {
        return ResponseEntity.ok(this.umsResourceService.insert(umsResource));
    }

    /**
     * 编辑数据
     *
     * @param umsResource 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsResource> edit(UmsResource umsResource) {
        return ResponseEntity.ok(this.umsResourceService.update(umsResource));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsResourceService.deleteById(id));
    }

}

