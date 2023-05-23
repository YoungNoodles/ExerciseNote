package com.cetc.mapper;

import com.cetc.pojo.Brand;
import com.cetc.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from tb_user;")
    List<User> selectAll();

    @Select("select * from tb_user where id = #{id}")
    User selectById(Integer id);
}
