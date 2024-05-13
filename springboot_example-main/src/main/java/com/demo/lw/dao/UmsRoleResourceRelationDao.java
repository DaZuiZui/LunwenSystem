package com.demo.lw.dao;

import com.demo.lw.entity.UmsRoleResourceRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (UmsRoleResourceRelation)表数据库访问层
 *
 * @author makejava
 * @since 2024-05-13 13:32:25
 */
@Mapper
public interface UmsRoleResourceRelationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRoleResourceRelation queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param umsRoleResourceRelation 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<UmsRoleResourceRelation> queryAllByLimit(UmsRoleResourceRelation umsRoleResourceRelation, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param umsRoleResourceRelation 查询条件
     * @return 总行数
     */
    long count(UmsRoleResourceRelation umsRoleResourceRelation);

    /**
     * 新增数据
     *
     * @param umsRoleResourceRelation 实例对象
     * @return 影响行数
     */
    int insert(UmsRoleResourceRelation umsRoleResourceRelation);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UmsRoleResourceRelation> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UmsRoleResourceRelation> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UmsRoleResourceRelation> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UmsRoleResourceRelation> entities);

    /**
     * 修改数据
     *
     * @param umsRoleResourceRelation 实例对象
     * @return 影响行数
     */
    int update(UmsRoleResourceRelation umsRoleResourceRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
