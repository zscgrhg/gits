package com.example.giteasier.ctrl.cmd;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class Repository {
    private long id;
    private String name;
    private String group;
    private String repository;
    private Timestamp creationTime;
    private Timestamp updateTime;
}
