package com.mx.model;

public class PermissionBean {
    private Integer permissionPid;
    private String  permissionName;
    private String  permissionUrl;

    public Integer getPermissionPid() {
        return permissionPid;
    }

    public void setPermissionPid(Integer permissionPid) {
        this.permissionPid = permissionPid;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    @Override
    public String toString() {
        return "PermissionBean{" +
                "permissionPid=" + permissionPid +
                ", permissionName='" + permissionName + '\'' +
                ", permissionUrl='" + permissionUrl + '\'' +
                '}';
    }
}
