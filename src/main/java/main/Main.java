package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import domain.Comment;
import service.CommentService;

public class Main {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var service = ctx.getBean(CommentService.class);
		var cmt = new Comment();
		cmt.setText("원형빈은 메소드 내에서 가져다 써야 그 메소드가 불릴 때마다 신생한다");
		service.sendComment(null);
	}

}
