package com.study.board.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.security.Timestamp;
@Getter
@Setter
@Entity
public class Comment extends BaseEntity{
    public Comment(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comment_Id;

    @NotBlank
    @Size(min=1, max=120)
    String content;

    @ManyToOne
    @JoinColumn(name="id")
    private Board board;

    @ManyToOne
    @JoinColumn(name="user_Id")
    private User user;

}
