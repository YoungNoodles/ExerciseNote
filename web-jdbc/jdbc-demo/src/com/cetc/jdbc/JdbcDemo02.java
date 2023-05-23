package com.cetc.jdbc;

import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;
import java.util.Set;

public class JdbcDemo02 {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
        //导包
        //注册驱动，8.0不需要手动注册驱动，会自动查询
        //连接驱动
        String url = "jdbc:mysql:///ysd";//本地连接，IP【127.0.0.1】或【localhost】和端口号可省略
        String username = "root";
        String password = "60500002";
        Connection conn = DriverManager.getConnection(url, username, password);

        //获取执行SQL的对象
        Statement stat = conn.createStatement();

        try {
            //开启事务
            conn.setAutoCommit(false);
//            //定义要执行的SQL
//            String sql1 = "UPDATE student SET admission_score = 644.00 WHERE name = '杨少达'";
//            //执行SQL
//            int count1 = stat.executeUpdate(sql1);
//            System.out.println(count1);
//            //定义要执行的SQL
//            String sql2 = "UPDATE student SET admission_score = 654.00 WHERE name = '李海帆'";
//            //执行SQL
//            int count2 = stat.executeUpdate(sql2);
//            System.out.println(count2);
            //定义要执行的查询SQL语句
            String sql3 = "SELECT * FROM student";
            //查询【DQL】
            ResultSet set = stat.executeQuery(sql3);
            while (set.next()) {
                System.out.println(set.getInt(1) + "\t" + set.getString(2) + "\t" + set.getString(3) + "\t" + set.getDate(4) + "\t" + set.getDouble(5) + "\t" + set.getString(6) + "\t" + set.getString(7) + "\t" + set.getString(8));
            }
            //没有异常，提交事务
            conn.commit();

            //释放资源
            set.close();
            stat.close();
            conn.close();
        } catch (Exception e) {
            //出现异常回滚
            conn.rollback();
//            throw new RuntimeException(e);
        }

    }
}
