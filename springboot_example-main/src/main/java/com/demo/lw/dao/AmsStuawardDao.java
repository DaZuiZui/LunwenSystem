package com.demo.lw.dao;

import com.demo.lw.entity.AmsStuaward;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
/**
 * (AmsStuaward)表数据库访问层
 *
 * @author makejava
 * @since 2024-05-13 13:13:23
 */
@Mapper
public interface AmsStuawardDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsStuaward queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param amsStuaward 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<AmsStuaward> queryAllByLimit(AmsStuaward amsStuaward, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param amsStuaward 查询条件
     * @return 总行数
     */
    long count(AmsStuaward amsStuaward);

    /**
     * 新增数据
     *
     * @param amsStuaward 实例对象
     * @return 影响行数
     */
    int insert(AmsStuaward amsStuaward);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AmsStuaward> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AmsStuaward> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AmsStuaward> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<AmsStuaward> entities);

    /**
     * 修改数据
     *
     * @param amsStuaward 实例对象
     * @return 影响行数
     */
    int update(AmsStuaward amsStuaward);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

