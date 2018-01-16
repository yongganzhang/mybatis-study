package com.shsxt.mybatis.dao;

import com.shsxt.mybatis.pojo.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface CustomerDao {

    @Select("SELECT  count(1) FROM  t_customer")
    public int queryCountCustome();

    @SelectProvider(method = "queryCountCustome", type = UserProvider.class) // 提供SQL 语句的对象
    public int queryCountCustomeV2();

    @Delete("DELETE  FROM  t_customer WHERE  id =  #{id}")
    public int delCustomerById(int id);


    @Select("SELECT\n" +
            "\tu.true_name\n" +
            "FROM\n" +
            "\tt_user u\n" +
            "JOIN t_user_role r ON (u.id = r.user_id)\n" +
            "JOIN t_role l ON (r.role_id = l.id) WHERE l.role_name = #{job}")
    public String queryCustomerMgrName(@Param("job") String job);


}
