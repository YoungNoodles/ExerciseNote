package com.cetc.jdbc;

import java.sql.*;

public class PreparedStatementDemo04 {
    public static void main(String[] args) throws Exception {
        //PreparedStatement的预编译功能默认是关闭的
        //要打开该功能，在url后加入参数【useServerPrepStmts=true】
        String userName = "zhangsan";
        String psd = "123456";
        //导入驱动jar包
        //注册驱动Class.forName(com.mysql.cj.jdbc.Driver);
        //创建连接器对象
        String url = "jdbc:mysql://localhost:3306/ysd?useServerPrepStmts=true";
        String username = "root";
        String password = "60500002";
        Connection conn = DriverManager.getConnection(url, username, password);
        //创建预编译SQL执行对象
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
        PreparedStatement preStat = conn.prepareStatement(sql);
        //将sql中的占位符?用输入的字符替代
        preStat.setString(1, userName);
        preStat.setString(2, psd);
        //执行SQL
        ResultSet rs = preStat.executeQuery();
        if (rs.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
