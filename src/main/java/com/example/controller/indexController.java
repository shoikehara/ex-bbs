package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Article;
import com.example.domain.Comment;
import com.example.form.ArticleForm;
import com.example.form.CommentForm;
import com.example.service.ArticleService;
import com.example.service.CommentService;

@Controller
@RequestMapping("/bulletin-board")
public class indexController {
	@Autowired
	private ArticleService articleService;
	@Autowired
	private CommentService commentService;
	@ModelAttribute
	public ArticleForm setUpArticleForm() {
		return new ArticleForm();
	}
	@ModelAttribute
	public CommentForm setUpCommentForm() {
		return new CommentForm();
	}
	
	@RequestMapping("")
	public String showList(Model model) {
		List<Article> articleList = articleService.findAll();		
		List<Comment> commentList = new ArrayList<>();
		for(Article article : articleList) {
			commentList = commentService.findByArticleId(article.getId());
			article.setCommentList(commentList);
		}
		model.addAttribute("articleList",articleList);
		return "article";
	}
}
