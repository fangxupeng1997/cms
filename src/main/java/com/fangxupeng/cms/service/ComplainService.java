package com.fangxupeng.cms.service;



import com.fangxupeng.cms.domain.Complain;
import com.fangxupeng.cms.vo.ComplainVO;
import com.github.pagehelper.PageInfo;

public interface ComplainService {
	//举报
	boolean insert(Complain complain);
	
	//查询举报
		PageInfo<Complain> selects(ComplainVO complainVO,Integer page,Integer pageSize);
}
