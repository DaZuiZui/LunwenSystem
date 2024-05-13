package com.demo.lw.controller;

import com.demo.lw.entity.UmsUser;
import com.demo.lw.service.UmsUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsUser)表控制层
 *
 * @author 1
 * @since 2024-05-13 13:50:41
 */
@RestController
@RequestMapping("umsUser")
public class UmsUserController {
    /**
     * 服务对象
     */
    @Resource
    private UmsUserService umsUserService;

    /**
     * 分页查询
     *
     * @param umsUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsUser>> queryByPage(UmsUser umsUser, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsUserService.queryByPage(umsUser, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsUser> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsUser> add(UmsUser umsUser) {
        return ResponseEntity.ok(this.umsUserService.insert(umsUser));
    }

    /**
     * 编辑数据
     *
     * @param umsUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsUser> edit(UmsUser umsUser) {
        return ResponseEntity.ok(this.umsUserService.update(umsUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsUserService.deleteById(id));
    }

}

