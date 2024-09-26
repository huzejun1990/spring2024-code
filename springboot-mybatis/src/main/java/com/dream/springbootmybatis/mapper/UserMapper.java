package com.dream.springbootmybatis.mapper;

import com.dream.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther: huzejun
 * @Date: 2024/9/26 22:13
 */
@Mapper
public interface UserMapper {

/*    @Select("select * from user where id = #{id}")
    User findById(Integer id);*/

    @Select("select * from user where id = #{id}")
    public User findById(Integer id);
}
