package com.xxx.entity;

public class User {
    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + name + ", password="
                + password + "]";
    }


    private int id;//主键
    private String name;//用户名
    private String password;//密码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
