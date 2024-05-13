package .controller;

import .entity.UmsRoleResourceRelation;
import .service.UmsRoleResourceRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UmsRoleResourceRelation)表控制层
 *
 * @author makejava
 * @since 2024-05-13 13:32:09
 */
@RestController
@RequestMapping("umsRoleResourceRelation")
public class UmsRoleResourceRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsRoleResourceRelationService umsRoleResourceRelationService;

    /**
     * 分页查询
     *
     * @param umsRoleResourceRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsRoleResourceRelation>> queryByPage(UmsRoleResourceRelation umsRoleResourceRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsRoleResourceRelationService.queryByPage(umsRoleResourceRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsRoleResourceRelation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.umsRoleResourceRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsRoleResourceRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsRoleResourceRelation> add(UmsRoleResourceRelation umsRoleResourceRelation) {
        return ResponseEntity.ok(this.umsRoleResourceRelationService.insert(umsRoleResourceRelation));
    }

    /**
     * 编辑数据
     *
     * @param umsRoleResourceRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsRoleResourceRelation> edit(UmsRoleResourceRelation umsRoleResourceRelation) {
        return ResponseEntity.ok(this.umsRoleResourceRelationService.update(umsRoleResourceRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.umsRoleResourceRelationService.deleteById(id));
    }

}

