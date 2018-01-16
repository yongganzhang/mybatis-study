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
//        UserDao userDao = session.getMapper(UserDao.class);
//        List<User> userList = userDao.queryUserLikeName("");
//        for ( User user :userList) {
//            System.out.println(user);
//        }
//        CustomerDao mapper = session.getMapper(CustomerDao.class);
//
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("khno", "KH20150526073022");
//        params.put("name", "风驰科技");
//
//        List<Customer> customers = mapper.queryCustomerByNoOrName(params);
//        for (Customer cus : customers) {
//            System.out.println(cus);
//        }

        UserDao userDao = session.getMapper(UserDao.class);
        List<User> userList = userDao.queryUserLikeNameV2("");
        for (User user : userList) {
            System.out.println(user);
        }

    }
}