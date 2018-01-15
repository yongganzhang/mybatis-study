package com.shsxt.mybatis;

import com.shsxt.mybatis.pojo.Custmer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 加载mybatis的配置文件
//        File file = Resources.getResourceAsFile("mybatis-config.xml");

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 构建数据库 会话
        SqlSession session = factory.openSession();

        Custmer cus = (Custmer)session.selectOne("com.shsxt.mybatis.mapper.customermapper.queryCustomerById", 2);


        session.close();

    }
}