package com.cetc;

import com.cetc.mapper.BrandMapper;
import com.cetc.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class BrandTest {
    @Test
    public void testSelectAll() throws Exception{
        //加载mybatis-config核心配置文件
        //获取inputStream对象
        //获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取mapper代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //查询所有
        List<Brand> brands = mapper.selectAll();

        System.out.println(brands);
        //释放资源
        sqlSession.close();
    }
}
