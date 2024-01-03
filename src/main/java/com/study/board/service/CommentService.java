package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.entity.Comment;
import com.study.board.repository.BoardRepository;
import com.study.board.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public void write(Comment comment) throws Exception{
        commentRepository.save(comment);
    }

    public List<Comment> commentList() {

        return commentRepository.findAll();
    }
    public Comment commentView(Long id) {

        return commentRepository.findById(id).get();

    }
    public void deletecomment(Long id){
        commentRepository.deleteById(id);
    }
}
