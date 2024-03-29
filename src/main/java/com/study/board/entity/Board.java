package com.study.board.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Board extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String filename;
    private String filepath;


    @Column(name="view_count", columnDefinition = "int default 0")
    private int viewCount;

    @OneToMany(mappedBy = "board")
    private List<Comment> comments;
}
