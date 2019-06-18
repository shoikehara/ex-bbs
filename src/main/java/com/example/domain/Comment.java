package com.example.domain;

public class Comment {
	
	/**ID*/
	private Integer id;
	/**名前*/
	private String name;
	/**記事*/
	private String content;
	/**記事ID*/
	private Integer articleId;
	
	
	
	@Override
	public String toString() {
		return "CommentDomain [id=" + id + ", name=" + name + ", content=" + content + ", articleId=" + articleId + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
}
