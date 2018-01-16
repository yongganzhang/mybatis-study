package com.shsxt.mybatis.dao;

import com.shsxt.mybatis.pojo.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface CustomerDao {

    public List<Customer> queryCustomerByNoOrName (Map<String, String> params) ;

    public int  updateCustomerByid (Customer cus) ;

}
