package com.example.restart.domain.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동으로 1씩 증가
    private Long id=null;
    @Column(nullable = false)
    private String name;
    private Integer age;

    public User(String name, Integer age){
        this.name=name;
        this.age=age;
    }
}
