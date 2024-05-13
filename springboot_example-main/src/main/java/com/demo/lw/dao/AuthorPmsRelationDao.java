package com.demo.lw.dao;

import com.demo.lw.entity.AuthorPmsRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (AuthorPmsRelation)表数据库访问层
 *
 * @author 1
 * @since 2024-05-13 13:17:30
 */
@Mapper
public interface AuthorPmsRelationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthorPmsRelation queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param authorPmsRelation 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<AuthorPmsRelation> queryAllByLimit(AuthorPmsRelation authorPmsRelation, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param authorPmsRelation 查询条件
     * @return 总行数
     */
    long count(AuthorPmsRelation authorPmsRelation);

    /**
     * 新增数据
     *
     * @param authorPmsRelation 实例对象
     * @return 影响行数
     */
    int insert(AuthorPmsRelation authorPmsRelation);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AuthorPmsRelation> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AuthorPmsRelation> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AuthorPmsRelation> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<AuthorPmsRelation> entities);

    /**
     * 修改数据
     *
     * @param authorPmsRelation 实例对象
     * @return 影响行数
     */
    int update(AuthorPmsRelation authorPmsRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

