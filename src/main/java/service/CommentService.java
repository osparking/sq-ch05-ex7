package service;

import org.springframework.stereotype.Service;

import domain.Comment;

@Service
public class CommentService {
	
	public void sendComment(Comment c) {
		var p = new CommentProcessor();
		
		p.setComment(c);
		p.processComment();
		p.validateComment();
		c = p.getComment();
		// 추가적 작업 수행
	}

}
