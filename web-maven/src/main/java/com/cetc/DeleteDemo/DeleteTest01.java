package com.cetc.DeleteDemo;

import com.cetc.mapper.BrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class DeleteTest01 {
    public static void main(String[] args) throws Exception{
        Integer id = 13;
        int[] ids = {22,23};

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

//        mapper.deleteById(id);
        mapper.deleteByIds(ids);

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
