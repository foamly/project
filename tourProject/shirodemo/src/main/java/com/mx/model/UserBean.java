package com.mx.model;

import java.util.HashSet;
import java.util.Set;

public class UserBean {
    private Integer userId;
    private String  userName;
    private String  userPassword;
    private Set<RoleBean> roles = new HashSet<>();

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Set<RoleBean> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleBean> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", roles=" + roles +
                '}';
    }
}
