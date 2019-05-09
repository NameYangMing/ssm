package com.baizhi.entity;

public class Province {
    private Integer id;
    private String ProvinceName;

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", ProvinceName='" + ProvinceName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    public Province(Integer id, String ProvinceName) {

        this.id = id;
        this.ProvinceName = ProvinceName;
    }

    public Province() {

    }
}
