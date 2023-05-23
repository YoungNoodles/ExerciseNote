package com.cetc.mapper;

import com.cetc.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    /**
     * 查询所有
     * @return
     */
    List<Brand> selectAll();

    /**
     * 按id查询一条
     * @param id
     * @return
     */
    Brand selectById(Integer id);

    /**
     * 多条件查询
        *1.散装数据,使用@Param("")标注参数占位符名称
        *2.封装进实体类的对象中,占位符的名称要和实体类成员变量名一致
        *3.封装进Map集合中,键名称要和占位符名称一致
     * @param status
     * @param brand
     * @param company
     * @return
     */
    List<Brand> selectByCondition(@Param("status") Integer status, @Param("brand") String brand, @Param("company") String company);

    List<Brand> selectByCondition(Brand brand);
    List<Brand> selectByCondition(Map map);

    /**
     * 单条件动态查询
        * 将值封装进实体类，传递实体类
        * 将值封装进Map集合，传递集合
     * @return
     */
    List<Brand> selectByOneCondition(Brand brand);
    List<Brand> selectByOneCondition(Map map);

    /**
     * 没有返回值的添加
        * 将数据封装到实体类中进行添加
        * 将数据封装到Map集合中进行封装
     */
    void insertOneBrand(Brand brand);
    void insertOneBrand(Map map);

    /**
     * 全字段修改
     */
    void updateAll(Brand brand);
    void updateAll(Map map);

    /**
     * 单个删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 根据ids数组批量删除
     */
    void deleteByIds(@Param("ids") int[] ids);
}
