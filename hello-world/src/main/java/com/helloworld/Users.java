package com.helloworld;

import jakarta.persistence.*;

@Entity
public class Users {
    @Id
    private Integer id;
    private String username;
    private Integer age;
    private String school;

    public Users() {
    }

    public Users(Integer id, String username, Integer age, String school) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.school = school;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
