package com.jwt.request;

import lombok.Data;

@Data
public class ChangeUserRoleRequest {
    private String userName;
    private String roleName;
}
