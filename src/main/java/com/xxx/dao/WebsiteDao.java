package com.xxx.dao;

import com.xxx.entity.Website;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Website)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 15:16:00
 */
public interface WebsiteDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Website queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Website> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param website 实例对象
     * @return 对象列表
     */
    List<Website> queryAll(Website website);

    /**
     * 新增数据
     *
     * @param website 实例对象
     * @return 影响行数
     */
    int insert(Website website);

    /**
     * 修改数据
     *
     * @param website 实例对象
     * @return 影响行数
     */
    int update(Website website);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}