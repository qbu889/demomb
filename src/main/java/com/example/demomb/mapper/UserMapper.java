package com.example.demomb.mapper;

import com.example.demomb.entity.User;
import com.example.demomb.entity.userEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {


    @Select("select * from userentity where is_delete = 0")  //查询所有数据
    List<userEntity> findALL();

    @Insert("INSERT into userentity (user,password,address,email)VALUES(#{user},#{password},#{address},#{email})")
    Integer save(userEntity entity);

    @Update("update userentity set user=#{user},password=#{password},address=#{address},email=#{email} where id = #{id}")
    Integer update(userEntity entity);

    @Delete("delete FROM userentity where id=#{id}")
    Integer delete(Integer id);

    @Update("update userentity set is_delete=1 where id = #{id}")
    Integer deletenotreal(Integer id);


}
