package com.demo.lw.controller;

import com.demo.lw.entity.AmsOthers;
import com.demo.lw.service.AmsOthersService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsOthers)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:05:51
 */
@RestController
@RequestMapping("amsOthers")
public class AmsOthersController {
    /**
     * 服务对象
     */
    @Resource
    private AmsOthersService amsOthersService;

    /**
     * 分页查询
     *
     * @param amsOthers 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AmsOthers>> queryByPage(AmsOthers amsOthers, PageRequest pageRequest) {
        return ResponseEntity.ok(this.amsOthersService.queryByPage(amsOthers, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AmsOthers> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.amsOthersService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param amsOthers 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AmsOthers> add(AmsOthers amsOthers) {
        return ResponseEntity.ok(this.amsOthersService.insert(amsOthers));
    }

    /**
     * 编辑数据
     *
     * @param amsOthers 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AmsOthers> edit(AmsOthers amsOthers) {
        return ResponseEntity.ok(this.amsOthersService.update(amsOthers));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.amsOthersService.deleteById(id));
    }

}

