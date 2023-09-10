package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import domain.Comment;

@Service
public class CommentService {
	
	@Autowired
	private ApplicationContext context;
	
	public void sendComment(Comment c) {
		
		var p = context.getBean("commentProcessor", CommentProcessor.class);
		
		p.setComment(c);
		p.processComment();
		p.validateComment();
		c = p.getComment();
		// 추가적 작업 수행
		System.out.println("comment sent");
	}

}
