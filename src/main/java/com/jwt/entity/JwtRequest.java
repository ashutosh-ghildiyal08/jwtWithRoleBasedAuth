package com.jwt.entity;

import lombok.Data;

@Data
public class JwtRequest {

    private String userName;
    private String userPassword;

}
