package com.cetc.InsertDemo;

import com.cetc.mapper.BrandMapper;
import com.cetc.pojo.Brand;
import com.sun.javafx.collections.MappingChange;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsertTest01 {
    public static void main(String[] args) throws Exception{
        String brandName = "玩家国度";
        String companyName = "华硕";
        String ordered = "30";
        String description = "不可阻挡，无所畏惧";

        Brand brand = new Brand();
        brand.setBrand(brandName);
        brand.setCompany(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);

        //获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理对象，进行添加操作
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.insertOneBrand(brand);
        //提交事务
        sqlSession.commit();
        //提交完再查找一下
//        String bra = "玩家国度";
//        Map map = new HashMap();
//        map.put("brand",bra);
//        List<Brand> brands = mapper.selectByCondition(map);
//        System.out.println(brands);
        //获取id
        Integer id = brand.getId();
        System.out.println(id);
        //释放资源
        sqlSession.close();
    }
}
