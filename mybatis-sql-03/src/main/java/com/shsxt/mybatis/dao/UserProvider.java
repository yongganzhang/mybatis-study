package com.shsxt.mybatis.dao;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Administrator on 2018/1/16.
 */
public class UserProvider {

    public String  queryCountCustome () {
        return new SQL(){{
            SELECT("count(1)");
            FROM("t_customer");
        }}.toString();
    }

}
