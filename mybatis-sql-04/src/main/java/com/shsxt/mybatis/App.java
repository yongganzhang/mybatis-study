package com.shsxt.mybatis;

import com.shsxt.mybatis.dao.GoodsDao;
import com.shsxt.mybatis.pojo.Goods;
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
//        SqlSession session = factory.openSession(true);
//        GoodsDao goodsDao = session.getMapper(GoodsDao.class);
//        Goods goods = goodsDao.queryGoodsById(7);
//        System.out.println(goods);
//        session.clearCache();
//        goods = goodsDao.queryGoodsById(7);



        ///////////////////////////////////////////
        ///////////////////////////////////////////

        SqlSession s1 = factory.openSession(true);
        GoodsDao goodsDao1 = s1.getMapper(GoodsDao.class);
        Goods goods = goodsDao1.queryGoodsById(1);
        System.out.println(goods);
        s1.close();

        SqlSession s2 = factory.openSession(true);
        GoodsDao goodsDao2 = s2.getMapper(GoodsDao.class);
        Goods goods2 = goodsDao2.queryGoodsById(1);
        System.out.println(goods2);

    }
}