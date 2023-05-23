package com.cetc.test;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.*;
import java.util.*;
import java.util.function.BiConsumer;

public class Test {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //导入德鲁伊jar包
        //注册数据库
        //加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);

        //实现增删改查
        int m = sc.nextInt();
        switch (m) {
            case 1: {
                insert(ds);
                break;
            }
            case 2: {
                delete(ds);
                break;
            }
            case 3: {
                update(ds);
                break;
            }
            case 4: {
                select(ds);
                break;
            }
            default:
                break;
        }
    }

    /**
     * 增
     *
     * @param ds
     * @throws Exception
     */
    public static void insert(DataSource ds) throws Exception {
        //获取连接
        Connection conn = ds.getConnection();
        //获取执行SQL对象
        Statement stmt = conn.createStatement();
        //输入要新增的信息：
        System.out.println("请输入产品id");
        Integer id = sc.nextInt();
        System.out.println("请输入品牌名称");
        String brand = sc.next();
        System.out.println("请输入公司名称");
        String company = sc.next();
        System.out.println("请输入排序序号");
        String ordered = sc.next();
        System.out.println("请输入标语");
        String description = sc.next();
        System.out.println("请输入品牌状态");
        String status = sc.next();
        //定义检查SQL语句
        String check = "SELECT * FROM brand WHERE id=" + id + ";";
        //查找是否已经存在
        ResultSet rs = stmt.executeQuery(check);
        if (rs.next()) {//若存在则抛出异常
            throw new RuntimeException();
        }
        //若不存在则将信息存入
        String sql = "INSERT INTO brand " +
                "VALUES (" + id + ", '" + brand + "', '" + company + "', " + ordered + ", '" + description + "', " + status + ");";
        //执行SQL进行添加
        int count = stmt.executeUpdate(sql);
        if (count == 1) {
            System.out.println("添加成功");
        }
        //释放资源
        stmt.close();
        conn.close();
    }

    /**
     * 删
     *
     * @param ds
     * @throws Exception
     */
    public static void delete(DataSource ds) throws Exception {
        //获取连接
        Connection conn = ds.getConnection();
        //获取执行SQL对象
        Statement stmt = conn.createStatement();
        //输入要删除的产品id
        Integer id = sc.nextInt();
        //写删除SQL
        String sql = "DELETE FROM brand WHERE id = " + id + ";";
        //执行删除语句
        int count = stmt.executeUpdate(sql);
        if (count > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        //释放资源
        stmt.close();
        conn.close();
    }

    /**
     * 改
     *
     * @param ds
     * @throws Exception
     */
    public static void update(DataSource ds) throws Exception {
        //获取连接
        Connection conn = ds.getConnection();
        //输入要修改的产品的id
        System.out.println("输入要修改数据行的id");
        Integer id = sc.nextInt();
        //输入要修改的字段
        System.out.println("请按顺序输入要修改的字段，使用“，”隔开");
        String str = sc.next();
        //将字段存入数组中
        String[] words = str.split("，");
        //输入进行修改后的值
        for (String word : words) {//将字段【键】和对应的【值】存入map中
            //获取预编译执行SQL对象
            String sql = "UPDATE brand SET "+word+" = ? WHERE id = ?;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println("请输入更新后【" + word + "】的值");
            String value = sc.next();
            pstmt.setString(1,value);
            pstmt.setInt(2,id);
            try {
                pstmt.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            //释放资源
            pstmt.close();
        }
        conn.close();

        System.out.println("修改成功");
    }

    /**
     * 查
     *
     * @param ds
     * @throws Exception
     */
    public static void select(DataSource ds) throws Exception {
        //获取连接
        Connection conn = ds.getConnection();
        //获取执行SQL对象

        Statement stmt = conn.createStatement();
        //输入模糊查询的字段
        System.out.println("请输入查询字段，包括id、brand、company");
        String word = sc.next();
        //模糊查询的内容
        String str = sc.next();
        String sql = "SELECT * FROM brand WHERE " + word + " LIKE '%" + str + "%';";
        //进行查询
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4) + ", " + rs.getString(5) + ", " + rs.getString(6));
            } else {
                System.out.println("查询对象不存在");
            }
            //释放资源
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
