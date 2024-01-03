package com.study.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    private Long user_id;

    private String pwd;

    @OneToMany(mappedBy="user")
    private List<Comment> comments;


}
