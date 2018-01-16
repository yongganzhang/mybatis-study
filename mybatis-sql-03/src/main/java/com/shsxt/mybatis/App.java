package com.shsxt.mybatis;

import com.shsxt.mybatis.dao.UserDaoV3;
import com.shsxt.mybatis.pojo.User;
import com.shsxt.mybatis.pojo.UserRole;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 加载mybatis的配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 构建数据库 会话
        SqlSession session = factory.openSession(true);

        UserDaoV3 daoV3 = session.getMapper(UserDaoV3.class);

//        User user = daoV3.queryUserInfoById(10);
        UserRole userRole = daoV3.queryUserRoleInfoById(2);

        System.out.println(userRole);


    }
}