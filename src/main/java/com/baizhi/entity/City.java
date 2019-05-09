package com.baizhi.entity;

public class City {
    private Integer id;
    private String CityName;
    private Integer pid;

    public City() {
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", CityName='" + CityName + '\'' +
                ", pid=" + pid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public City(Integer id, String CityName, Integer pid) {

        this.id = id;
        this.CityName = CityName;
        this.pid = pid;
    }
}
