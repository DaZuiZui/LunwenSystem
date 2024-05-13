package com.demo.lw.dao;

import com.demo.lw.entity.UmsUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (UmsUser)表数据库访问层
 *
 * @author makejava
 * @since 2024-05-13 13:50:41
 */
@Mapper
public interface UmsUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsUser queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param umsUser 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<UmsUser> queryAllByLimit(UmsUser umsUser, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param umsUser 查询条件
     * @return 总行数
     */
    long count(UmsUser umsUser);

    /**
     * 新增数据
     *
     * @param umsUser 实例对象
     * @return 影响行数
     */
    int insert(UmsUser umsUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UmsUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UmsUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UmsUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UmsUser> entities);

    /**
     * 修改数据
     *
     * @param umsUser 实例对象
     * @return 影响行数
     */
    int update(UmsUser umsUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

