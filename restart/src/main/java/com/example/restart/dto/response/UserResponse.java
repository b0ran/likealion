package com.example.restart.dto.response;

import lombok.Getter;

@Getter
public class UserResponse {
    private long id;
    private String name;
    private Integer age;

    public UserResponse(long id, String name, Integer age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
