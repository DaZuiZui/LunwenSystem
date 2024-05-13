package com.demo.lw.dao;

import com.demo.lw.entity.AmsPmsRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (AmsPmsRelation)表数据库访问层
 *
 * @author 1
 * @since 2024-05-13 13:09:31
 */
@Mapper
public interface AmsPmsRelationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsPmsRelation queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param amsPmsRelation 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<AmsPmsRelation> queryAllByLimit(AmsPmsRelation amsPmsRelation, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param amsPmsRelation 查询条件
     * @return 总行数
     */
    long count(AmsPmsRelation amsPmsRelation);

    /**
     * 新增数据
     *
     * @param amsPmsRelation 实例对象
     * @return 影响行数
     */
    int insert(AmsPmsRelation amsPmsRelation);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AmsPmsRelation> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AmsPmsRelation> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AmsPmsRelation> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<AmsPmsRelation> entities);

    /**
     * 修改数据
     *
     * @param amsPmsRelation 实例对象
     * @return 影响行数
     */
    int update(AmsPmsRelation amsPmsRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

