package com.demo.lw.controller;

import com.demo.lw.entity.UmsMenu;
import com.demo.lw.service.UmsMenuService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsMenu)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:26:02
 */
@RestController
@RequestMapping("umsMenu")
public class UmsMenuController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMenuService umsMenuService;

    /**
     * 分页查询
     *
     * @param umsMenu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsMenu>> queryByPage(UmsMenu umsMenu, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsMenuService.queryByPage(umsMenu, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsMenu> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsMenuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMenu 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsMenu> add(UmsMenu umsMenu) {
        return ResponseEntity.ok(this.umsMenuService.insert(umsMenu));
    }

    /**
     * 编辑数据
     *
     * @param umsMenu 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsMenu> edit(UmsMenu umsMenu) {
        return ResponseEntity.ok(this.umsMenuService.update(umsMenu));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsMenuService.deleteById(id));
    }

}

