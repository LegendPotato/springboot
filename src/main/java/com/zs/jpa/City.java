package com.zs.jpa;

import javax.persistence.*;

/**
 * @author dalaoyang
 * @Description
 * @project springboot_learn
 * @package com.dalaoyang.Entity
 * @email 397600342@qq.com
 * @date 2018/4/7
 */

//<!--jpa的话是必须有实体类的，无论是从实体类到表的映射，还是表到实体类的映射-->
@Entity
@Table(name="city")
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int cityId;
    private String cityName;
    private String cityIntroduce;

    public City(int cityId, String cityName, String cityIntroduce) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.cityIntroduce = cityIntroduce;
    }

    public City(String cityName, String cityIntroduce) {
        this.cityName = cityName;
        this.cityIntroduce = cityIntroduce;
    }

    public City() {
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityIntroduce() {
        return cityIntroduce;
    }

    public void setCityIntroduce(String cityIntroduce) {
        this.cityIntroduce = cityIntroduce;
    }
}
