package com.shsxt.mybatis;

import com.shsxt.mybatis.dao.CustomerDao;
import com.shsxt.mybatis.dao.UserDao;
import com.shsxt.mybatis.pojo.Customer;
import com.shsxt.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        CustomerDao customerDao = session.getMapper(CustomerDao.class);
        int count = customerDao.queryCountCustome();
        System.out.println(count);

//
//        int byId = customerDao.delCustomerById(19);
//        System.out.println(byId);


        String mgrName = customerDao.queryCustomerMgrName("客户经理");
        System.out.println(mgrName);
    }
}