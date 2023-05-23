package com.cetc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //一、导入驱动jar包
        //二、注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");

        //三、获取连接
        String url = "jdbc:mysql://" /*localhost:3306*/ + "/ysd";
        String username = "root";
        String password = sc.nextLine();
        Connection conn = DriverManager.getConnection(url, username, password);

        //四、定义SQL语句
        String sql = "UPDATE my_family SET name = '小睿睿' where name = '陈思睿'";

        //五、获取执行SQL对象
        Statement stat = conn.createStatement();

        //六、执行SQL
        int count = stat.executeUpdate(sql);//返回影响的行数

        //七、处理结果
        System.out.println(count);

        //八、释放资源
        //从后往前释放
        stat.close();
        conn.close();
    }
}
