package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Comment;
import com.example.form.CommentForm;
import com.example.service.CommentService;

@Controller
@RequestMapping("/bulletin-board")
public class insertCommentController {
	@Autowired
	private CommentService commentService;
	
	/**
	 * コメントの投稿.
	 * 
	 * @param form フォーム
	 * @return 掲示板画面
	 */
	@RequestMapping("/postcomment")
	public String insertComment(@Validated CommentForm form,BindingResult result, Model model) {
//		if (result.hasErrors()) {
//			return index(model);
//		}
		Comment comment = new Comment();
		BeanUtils.copyProperties(form, comment);
		commentService.insert(comment);
		return "redirect:/bulletin-board";
	}

}
