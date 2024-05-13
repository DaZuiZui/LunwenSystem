package com.demo.lw.controller;

import com.demo.lw.entity.AmsReport;
import com.demo.lw.service.AmsReportService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsReport)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:10:41
 */
@RestController
@RequestMapping("amsReport")
public class AmsReportController {
    /**
     * 服务对象
     */
    @Resource
    private AmsReportService amsReportService;

    /**
     * 分页查询
     *
     * @param amsReport 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AmsReport>> queryByPage(AmsReport amsReport, PageRequest pageRequest) {
        return ResponseEntity.ok(this.amsReportService.queryByPage(amsReport, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AmsReport> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.amsReportService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param amsReport 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AmsReport> add(AmsReport amsReport) {
        return ResponseEntity.ok(this.amsReportService.insert(amsReport));
    }

    /**
     * 编辑数据
     *
     * @param amsReport 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AmsReport> edit(AmsReport amsReport) {
        return ResponseEntity.ok(this.amsReportService.update(amsReport));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.amsReportService.deleteById(id));
    }

}

