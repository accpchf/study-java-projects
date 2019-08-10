package org.springboot.domain;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 用户实体类
 *
 */
@Table(name="user")
public class User {

    /**
     * 城市编号
     */
    private Long id;

    /**
     * 城市名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 描述
     */
    private String description;

    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
