package com.webs.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by windows10 on 2017/10/25.
 * 实现序列化接口，确保session功能正常使用
 */
public class User implements Serializable{
    private String name;//
    private String password;
    private Date birthday;//yyyy-MM-dd
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
