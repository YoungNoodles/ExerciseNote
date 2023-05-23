package com.cetc.UpdateDemp;

import com.cetc.mapper.BrandMapper;
import com.cetc.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.BitSet;
import java.util.List;

public class UpdateTest01 {
    /**
     * 改
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        String brandName = "机械革命";
        Integer id = 12;
        String companyName = "机械革命";
        String description = "你好烦哎";
        Brand brand = new Brand();
        brand.setId(id);
        brand.setBrand(brandName);
        brand.setCompany(companyName);
        brand.setDescription(description);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.updateAll(brand);

        Brand brand1 = mapper.selectById(brand.getId());
        System.out.println(brand1);

        List<Brand> brands = mapper.selectAll();
        System.out.println(brands);

        sqlSession.close();
    }
}
