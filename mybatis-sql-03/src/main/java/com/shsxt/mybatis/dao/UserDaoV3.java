package com.shsxt.mybatis.dao;

import com.shsxt.mybatis.pojo.User;
import com.shsxt.mybatis.pojo.UserRole;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface UserDaoV3 {

    public  User queryUserInfoById (int id);

    public  User queryUserInfoByIdV2 (int id);

    public UserRole queryUserRoleInfoById (int id);

}
