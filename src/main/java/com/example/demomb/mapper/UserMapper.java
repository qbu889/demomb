package com.example.demomb.mapper;

import com.example.demomb.entity.User;
import com.example.demomb.entity.userEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {


//    @Select("select * from userentity")  //查询所有数据
//    List<userEntity> findALL();
//
//    @Insert("INSERT into userentity (username,password,address,email)VALUES(#{username},#{password},#{address},#{email})")
//    @Insert("INSERT into demo (username,password,address,email)VALUES(#{username},#{password},#{address},#{email})")
//    Integer save(userEntity entity);
//
//
//    Integer update(userEntity entity);

    //添加
    void insert(User user);
    //删除
    void delete(Long id);
    //修改
    void update(User user);
    //分页条件查询
    List<User> getPages(User user);
}
