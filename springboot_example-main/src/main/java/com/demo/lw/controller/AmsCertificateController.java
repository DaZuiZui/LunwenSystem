package com.demo.lw.controller;

import com.demo.lw.entity.AmsCertificate;
import com.demo.lw.service.AmsCertificateService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AmsCertificate)表控制层
 *
 * @author 1
 * @since 2024-05-13 11:17:43
 */
@RestController
@RequestMapping("amsCertificate")
public class AmsCertificateController {
    /**
     * 服务对象
     */
    @Resource
    private AmsCertificateService amsCertificateService;

    /**
     * 分页查询
     *
     * @param amsCertificate 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AmsCertificate>> queryByPage(AmsCertificate amsCertificate, PageRequest pageRequest) {
        return ResponseEntity.ok(this.amsCertificateService.queryByPage(amsCertificate, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AmsCertificate> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.amsCertificateService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param amsCertificate 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AmsCertificate> add(AmsCertificate amsCertificate) {
        return ResponseEntity.ok(this.amsCertificateService.insert(amsCertificate));
    }

    /**
     * 编辑数据
     *
     * @param amsCertificate 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AmsCertificate> edit(AmsCertificate amsCertificate) {
        return ResponseEntity.ok(this.amsCertificateService.update(amsCertificate));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.amsCertificateService.deleteById(id));
    }

}

