package com.shsxt.mybatis.dao;

import com.shsxt.mybatis.pojo.Custmer;

import java.util.List;


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


    public int batchAddCustomer (List<Custmer> list);


    /**
     * 更新
     * @param cus
     * @return
     */
    public  int updateCustomerById (Custmer cus);

    /**
     * 删除
     * @param id
     * @return
     */
    public int  delCustomerById (int id);

}
