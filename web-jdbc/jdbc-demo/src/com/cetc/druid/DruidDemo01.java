package com.cetc.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/**
 * Druid【德鲁伊】数据库连接池
 */
public class DruidDemo01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //导入druid-jar包
//        System.out.println(System.getProperty("user.dir"));
        //定义配置文件————编写【.properties】后缀的配置文件
        //包括要连接的数据库信息、连接数量、未响应时间等
        //加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbc-demo/src/druid.properties"));
        //获取连接池对象：DataSource
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        //获取数据库连接对象：Connection
        Connection conn = ds.getConnection();
        int m = sc.nextInt();

        switch (m){
            case 1:{
                try {
                    login(conn);
                } catch (RuntimeException e) {
                    System.out.println("用户名或密码错误");
                }
                break;
            }

            case 2:{
                try {
                    logon(conn);
                } catch (RuntimeException e) {
                    System.out.println("用户名已存在！");
                }
                break;
            }
        }

//        System.out.println(conn);
    }

    public static void login(Connection conn) throws Exception{
        Scanner sc = new Scanner(System.in);
        //获取PreparedStatement对象
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?;";
        PreparedStatement pStmt = conn.prepareStatement(sql);
        //设定输入信息
        String userName = "siruizi";
        String psd = "952388";
        pStmt.setString(1,userName);
        pStmt.setString(2,psd);
        //获取查询返回值判断是否登录成功
        ResultSet rs = pStmt.executeQuery();
        while (rs.next()){
            System.out.println("欢迎回来！ " + rs.getString("username"));
        }
    }

    public static void logon(Connection conn) throws Exception{
        Scanner sc = new Scanner(System.in);
        //获取Statement对象
        Statement stmt = conn.createStatement();
        //输入用户名，密码
        String username = sc.nextLine();
        String password = sc.nextLine();
        //定义SQL语句，检查用户名是否存在
        String check = "SELECT * FROM user WHERE username = '" + username + "';";
        ResultSet checkSet = stmt.executeQuery(check);
        if (checkSet.next()) {//若检查存在，则抛出错误
            throw new RuntimeException();
        }
        //若不存在，则进行注册操作
        String sql = "INSERT INTO user VALUES (default,'" + username + "','" + password + "')";
        stmt.executeUpdate(sql);
        System.out.println("注册成功");
    }
}
