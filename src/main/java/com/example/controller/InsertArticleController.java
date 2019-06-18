package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Article;
import com.example.form.ArticleForm;
import com.example.form.CommentForm;
import com.example.service.ArticleService;

public class InsertArticleController {
	@Autowired
	private ArticleService articleService;
	@ModelAttribute
	public ArticleForm setUpArticleForm() {
		return new ArticleForm();
	}
	@ModelAttribute
	public CommentForm setUpCommentForm() {
		return new CommentForm();
	}
	@RequestMapping("/postarticle")
	public String articleInsert(@Validated ArticleForm articleForm,BindingResult result ,Model model) {
		Article article = new Article();
		if(result.hasErrors()) {
			return "bulletin-board";
		}
		article.setName(articleForm.getName());
		article.setContent(articleForm.getContent());
		articleService.insert(article);
		
		return "redirect:/bulletin-board/";
	}
}
