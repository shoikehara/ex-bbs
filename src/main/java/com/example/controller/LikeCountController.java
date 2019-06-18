package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/likeCount")
public class LikeCountController {
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<Integer, Integer> likeCount(Integer articleId, Integer count) {
		Map<Integer, Integer> likeCount = new HashMap<>();
		System.out.println(articleId);
		likeCount.put(articleId,count);
		return likeCount;
	}
}
