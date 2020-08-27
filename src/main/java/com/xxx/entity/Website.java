package com.xxx.entity;

import java.io.Serializable;

/**
 * (Website)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:16:00
 */
public class Website implements Serializable {
    private static final long serialVersionUID = 385256293325981039L;

    private Integer id;

    private String webname;

    private String address;

    private String logo;

    private String developer;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

}