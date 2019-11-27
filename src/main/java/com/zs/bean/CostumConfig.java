package com.zs.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhangshuai_sx
 * @date 2019/10/9 10:01
 */

@Component
@ConfigurationProperties(prefix = "custom")
public class CostumConfig {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "CostumConfig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
