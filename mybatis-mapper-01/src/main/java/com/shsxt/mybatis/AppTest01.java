package com.shsxt.mybatis;

import com.shsxt.mybatis.dao.CustomerDao;
import com.shsxt.mybatis.pojo.Custmer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/1/15.
 */
public class AppTest01 {

    public static void main(String[] args) throws IOException {
        // 加载mybatis的配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 构建数据库 会话
        SqlSession session = factory.openSession(true);
        CustomerDao customerDao = session.getMapper(CustomerDao.class);

        Custmer custmer = new Custmer();
        custmer.setUserName("songzuerV2");
        custmer.setBalance(123);
//        int i = customerDao.addCusomerHasNoKey(custmer);

        customerDao.addCusomerHasKey(custmer);
        System.out.println(custmer.getId());


    }
}
