package com.example;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 
 * コメントのリクエストパラメータが入るフォーム.
 * 
 * @author risa.nazato
 *
 */
public class CommentForm {

	/** 記事のID */
	private Integer articleId;
	/** 名前 */
	@NotBlank(message = "名前を入力してください。")
	@Size(min=1,max=50,message = "名前は50字以内で入力してください。")
	private String name;
	/** コンテント */
	@NotBlank(message = "コメント内容を入力してください。")
	private String content;

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}