package com.demo.lw.dao;

import com.demo.lw.entity.AmsBook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (AmsBook)表数据库访问层
 *
 * @author makejava
 * @since 2024-05-13 11:14:59
 */
@Mapper
public interface AmsBookDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsBook queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param amsBook 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<AmsBook> queryAllByLimit(AmsBook amsBook, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param amsBook 查询条件
     * @return 总行数
     */
    long count(AmsBook amsBook);

    /**
     * 新增数据
     *
     * @param amsBook 实例对象
     * @return 影响行数
     */
    int insert(AmsBook amsBook);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AmsBook> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AmsBook> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AmsBook> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<AmsBook> entities);

    /**
     * 修改数据
     *
     * @param amsBook 实例对象
     * @return 影响行数
     */
    int update(AmsBook amsBook);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

