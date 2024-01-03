package com.study.board.controller;


import com.study.board.entity.Board;
import com.study.board.entity.Comment;
import com.study.board.service.BoardService;
import com.study.board.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;
    @Autowired
    private BoardService boardService;

    @PostMapping("/board/addComment")
    public String addCommentPro(@RequestParam("comment") String comment, Model model,@RequestParam("boardId") Integer id) throws Exception{

        Comment cmt = new Comment();
        cmt.setContent(comment);
        commentService.write(cmt);
        model.addAttribute("comments",commentService.commentList());

        model.addAttribute("board",boardService.boardView(id));
        return "boardview";
    }
}
