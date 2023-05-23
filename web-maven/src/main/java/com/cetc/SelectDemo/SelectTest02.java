package com.cetc.SelectDemo;


import com.cetc.mapper.BrandMapper;
import com.cetc.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * MyBatis 快速入门
 */
public class SelectTest02 {
    public static void main(String[] args) throws Exception {
//        final  Logger log = LoggerFactory.getLogger(SelectTest02.class);
        //1、加载MyBatis核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2、获取sqlSession对象，执行SQL语句
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //进行查询操作，selectList是查询所有，selectOne是查一个
        //将
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        List<User> users = mapper.selectAll();
//        System.out.println(users);

        List<Brand> mapper = sqlSession.getMapper(BrandMapper.class).selectAll();
        System.out.println(mapper);
        //3、释放资源
        sqlSession.close();

//        log.info("asdff");
//        log.warn("asdff");
//        log.error("asdff");
    }
}
