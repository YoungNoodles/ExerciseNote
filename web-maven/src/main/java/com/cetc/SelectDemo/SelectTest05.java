package com.cetc.SelectDemo;

import com.cetc.mapper.BrandMapper;
import com.cetc.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectTest05 {
    public static void main(String[] args) throws Exception{
        Integer id = 13;
        String brandName = "小米";
        String companyName = "三只松鼠";

        brandName = "%" + brandName + "%";
        companyName = "%" + companyName + "%";

        Brand brand = new Brand();
        brand.setId(id);

        Map map = new HashMap();
//        map.put("brand",brandName);
        //传递配置文件
        //获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取代理
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> brands = mapper.selectByOneCondition(brand);

        List<Brand> brands = mapper.selectByOneCondition(brand);

        System.out.println(brands);

        //释放资源
        sqlSession.close();
    }
}
