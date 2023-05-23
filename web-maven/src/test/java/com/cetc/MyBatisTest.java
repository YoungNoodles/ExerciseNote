package com.cetc;

import com.cetc.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * MyBatis 快速入门
 */
public class MyBatisTest {
    public static void main(String[] args) throws Exception {
        //1、加载MyBatis核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2、获取sqlSession对象，执行SQL语句
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //进行查询操作，selectList是查询所有，selectOne是查一个
        //传递字符串参数为【namespace.id】-【命名空间.SQL唯一标识】
        List<User> users = sqlSession.selectList("SelectTest01.selectAll");

        System.out.println(users);
        //3、释放资源
        sqlSession.close();
    }
}
