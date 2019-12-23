package com.fangxupeng.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fangxupeng.cms.dao.CommentMapper;
import com.fangxupeng.cms.domain.Comment;
import com.fangxupeng.cms.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class CommentServiceImpl implements CommentService {
	@Resource
	private CommentMapper commentMapper;

	@Override
	public int insert(Comment comment) {
		// TODO Auto-generated method stub
		return commentMapper.insert(comment);
	}

	@Override
	public PageInfo<Comment> selects(Comment comment,Integer page,Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		List<Comment> list = commentMapper.selects(comment);
		return new PageInfo<Comment>(list);
	}

}
