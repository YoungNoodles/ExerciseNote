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
import java.util.Scanner;

public class SelectTest04 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //用户输入参数
        Integer status = 1;
        String brand = "华为";
        String company = "华为";

        //处理参数
        brand = "%" + brand + "%";
        company = "%" + company + "%";

        Brand bra = new Brand();
        bra.setStatus(status);
        bra.setBrand(brand);
        bra.setCompany(company);

        Map map = new HashMap();
        map.put("status", status);
        map.put("brand", brand);
        map.put("company", company);

        //获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> brands = mapper.selectByCondition(status, brand, company);
//        List<Brand> brands = mapper.selectByCondition(bra);
        List<Brand> brands = mapper.selectByCondition(map);

        System.out.println(brands);

        //释放资源
        sqlSession.close();
    }
}
