package com.shsxt.mybatis;

import com.shsxt.mybatis.dao.CustomerDao;
import com.shsxt.mybatis.dao.GoodsDao;
import com.shsxt.mybatis.pojo.Custmer;
import com.shsxt.mybatis.pojo.Goods;
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
 *
 */
public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 加载mybatis的配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 构建数据库 会话
        SqlSession session = factory.openSession(true);

        // 接口映射器 ----》 ibatis ---> mybatis 新增加的特性值
//        CustomerDao customerDao = session.getMapper(CustomerDao.class);
//        Custmer zhaoliying = customerDao.queryCustomerByName("zhaoliying");
//        System.out.println(zhaoliying);
//
//        GoodsDao goodsDao = session.getMapper(GoodsDao.class);
//        Goods goods = goodsDao.queryGoodsById(2);
//        System.out.println(goods);

        GoodsDao goodsDao = session.getMapper(GoodsDao.class);

//        GoodsDao goodsDao = session.getMapper(GoodsDao.class);
//        List<Goods> goods = goodsDao.queryGoodslikeGoodsName("n");
//        for (Goods temp: goods  ) {
//            System.out.println(temp);
//        }

//        Map<String, Object> params = new HashMap<String, Object>();
//        params.put("id",1);
//        params.put("goodsName", "spring");
//        Goods goods = goodsDao.queryGoodsByIdAndGoodsName(params);
//        System.out.println(goods);

//        Goods good = new Goods();
//        good.setId(4);
//        good.setGoodsName("web");
//
//        Goods v2 = goodsDao.queryGoodsByIdAndGoodsNameV2(good);
//        System.out.println(v2);

        ///////////////////////////////////////////////////
        CustomerDao customerDao = session.getMapper(CustomerDao.class);

//        Integer count = customerDao.queryCunstomerCount();
//        System.out.println(count);

        String name = customerDao.queryCunstomerNameById(2);
        System.out.println(name);

    }
}