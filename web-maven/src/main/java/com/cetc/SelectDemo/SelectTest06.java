package com.cetc.SelectDemo;

import com.cetc.mapper.UserMapper;
import com.cetc.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SelectTest06 {
    /**
     * 注解开发实现SQL功能
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        //获取sqlSessionFactory，固定格式
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlSession对象和mapper代理
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //使用代理执行SQL语句
        User user = mapper.selectById(1);
        //打印查询结果
        System.out.println(user);
        //释放资源
        sqlSession.close();

    }
}
