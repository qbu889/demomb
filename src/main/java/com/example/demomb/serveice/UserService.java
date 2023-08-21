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

    //添加
    public void registerUser(User user) {
        userMapper.insert(user);
    }
    //删除
    public void deleteUser(Long id) {
        userMapper.delete(id);
    }
    //修改
    public void updateUser(User user) {
        userMapper.update(user);
    }

    /**
     * 分页条件查询
     *
     * @param pageNum  当前页
     * @param pageSize 每一页显示条数
     * @param user     封装的查询条件
     * @return 返回分页后的数据
     */
    public List<User> listUser(Integer pageNum, Integer pageSize, User user) {
        /*
         startPage方法自动为Mpper.xml中的SQL，加上 limit pageNum,pageSize，在SQL中就不用写了limit了 排序也可通过startPage设置
         */
        PageHelper.startPage(pageNum, pageSize);
        List<User> list = userMapper.getPages(user);
        //可以进一步包装成更完整的数据 PageInfo 分页对象，方便前端展示，里面封装了数据total这些）
        //PageInfo<User> pageInfo = new PageInfo<>(list);
        return list;
    }

}

