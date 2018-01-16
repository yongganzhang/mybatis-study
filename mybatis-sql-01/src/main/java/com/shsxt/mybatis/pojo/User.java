package com.shsxt.mybatis.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


//@Setter
//@Getter
@Data
public class User {

    private int id;

    private String userName;

    private String userPwd;

    private String trueName;

    private String email;

    private String phone;

    private String isValid;


}
