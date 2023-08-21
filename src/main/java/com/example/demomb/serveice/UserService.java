package com.example.demomb.serveice;

import com.example.demomb.entity.User;
import com.example.demomb.entity.userEntity;
import com.example.demomb.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper Usermanager;

    @Autowired
    private UserMapper userMapper;

    public List<userEntity> findall() {

        return Usermanager.findALL();
    }

    public Integer save(userEntity entity) {
        if (entity.getId() == null){  //如果id为空，则为新增
            return userMapper.save(entity);
        }else{                        //id不为空则是更新
            return userMapper.update(entity);
        }
    }

}

