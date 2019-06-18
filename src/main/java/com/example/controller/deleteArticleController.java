package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.ArticleService;

@Controller
@RequestMapping("/bulletin-board")
public class deleteArticleController {
	
	@Autowired
	private ArticleService articleService;
	/**
	 * 
	 * 記事の削除.
	 * 
	 * @param id 記事ID
	 * @return 掲示板画面
	 */
	@RequestMapping("/deletearticle")
	public String deleteArticle(Integer id) {
		articleService.delete(id);
		return "redirect:/bulletin-board";
	}

}
