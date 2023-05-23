package com.cetc.jdbc;

import com.cetc.pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class ResultSetDemo03 {
    public static void main(String[] args) throws Exception {
        //连接数据库
        //导入驱动jar包
        //注册驱动
        //Class.forName("com.mysql.cj.jdbc.Driver");
        //连接驱动
        String url = "jdbc:mysql:///ysd";
        String username = "root";
        String password = "60500002";
        //创建连接器对象
        Connection conn = DriverManager.getConnection(url, username, password);
        //创建SQL执行对象
        Statement stat = conn.createStatement();
        //定义SQL语句
        String sql = "SELECT * FROM student";
        //遍历数据库得到ArrayList
        ResultSet rs = stat.executeQuery(sql);
        ArrayList<Student> list = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String gender = rs.getString("gender");
            Date birthday = rs.getDate("birthday");
            double admission_score = rs.getDouble("admission_score");
            String e_mail = rs.getString("e_mail");
            String phone = rs.getString("phone");
            String student_status = rs.getString("student_status");
            Student stu = new Student(id, name, gender, birthday, admission_score, e_mail, phone, student_status);
            list.add(stu);
        }

        //释放资源
        rs.close();
        stat.close();
        conn.close();

        //遍历集合
        System.out.println(list);
    }
}
