package com.mx.model;

import java.util.HashSet;
import java.util.Set;

public class RoleBean {
    private Integer roleId;
    private String  roleName;
    private Set<PermissionBean> permissionBean = new HashSet<>();

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<PermissionBean> getPermissionBean() {
        return permissionBean;
    }

    public void setPermissionBean(Set<PermissionBean> permissionBean) {
        this.permissionBean = permissionBean;
    }

    @Override
    public String toString() {
        return "RoleBean{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", permissionBean=" + permissionBean +
                '}';
    }
}
