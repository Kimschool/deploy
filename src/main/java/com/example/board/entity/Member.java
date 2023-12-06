package com.example.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Member {

    @Id
    private String id;

    private String password;

    private String name;

}
