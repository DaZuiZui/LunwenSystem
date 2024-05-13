package com.demo.lw.dao;

import com.demo.lw.entity.AmsOthers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (AmsOthers)表数据库访问层
 *
 * @author 1
 * @since 2024-05-13 13:05:51
 */
@Mapper
public interface AmsOthersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AmsOthers queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param amsOthers 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<AmsOthers> queryAllByLimit(AmsOthers amsOthers, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param amsOthers 查询条件
     * @return 总行数
     */
    long count(AmsOthers amsOthers);

    /**
     * 新增数据
     *
     * @param amsOthers 实例对象
     * @return 影响行数
     */
    int insert(AmsOthers amsOthers);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AmsOthers> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AmsOthers> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AmsOthers> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<AmsOthers> entities);

    /**
     * 修改数据
     *
     * @param amsOthers 实例对象
     * @return 影响行数
     */
    int update(AmsOthers amsOthers);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

