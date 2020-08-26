package com.xxx.entity;

public class WebSite {
    @Override
    public String toString() {
        return "WebSite [id=" + id + ", webname=" + webname + ", address="
                + address + ",category="+category+",developer="+developer+"]";
    }
    private int id;
    private String webname;
    private String address;
    private String category;
    private String developer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
