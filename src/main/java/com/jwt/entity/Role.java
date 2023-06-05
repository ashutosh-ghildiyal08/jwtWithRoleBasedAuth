package com.jwt.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @Column(name = "name")
    private String roleName;
    @Column(name = "description")
    private String roleDescription;


}
