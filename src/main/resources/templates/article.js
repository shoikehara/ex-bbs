function like(articleId) {
		$.ajax({
			type : "GET", 				
			url : "/like", 				
			data : {
				articleId : articleId
			}, 							
			dataType: "json",			 
			async : true,				
			success : function(data) {
				
				likeCount = data["likeCount"];
				$("#likeCount" + articleId).text(likeCount)
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert("リクエスト時にエラーが発生しました：" + textStatus + ":\n" + errorThrown);
			}
		});
	}