package com.shsxt.mybatis.dao;

import com.shsxt.mybatis.pojo.Custmer;


public interface CustomerDao {

    public Custmer queryCustomerByName (String userName) ;

    public Integer queryCunstomerCount () ;

    public String queryCunstomerNameById (int id) ;


    /**
     * 查询数据
     * @param custmer
     * @return
     */
    public  int addCusomerHasNoKey (Custmer custmer);


    /**
     * 查询数据
     * @param custmer
     * @return
     */
    public  int addCusomerHasKey (Custmer custmer);


}
