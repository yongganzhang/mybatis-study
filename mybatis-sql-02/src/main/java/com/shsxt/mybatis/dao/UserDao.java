package com.shsxt.mybatis.dao;

import com.shsxt.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface UserDao {

    public List<User> queryUserLikeName (@Param("userName") String name);

    public List<User> queryUserLikeNameV2 (@Param("userName") String name);

}
