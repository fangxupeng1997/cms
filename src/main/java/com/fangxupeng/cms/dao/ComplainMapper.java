package com.fangxupeng.cms.dao;

import java.util.List;

import com.fangxupeng.cms.domain.Complain;
import com.fangxupeng.cms.vo.ComplainVO;

public interface ComplainMapper {
	
	int insert(Complain complain);
	
	//查询举报
	List<Complain> selects(ComplainVO complainVO);

}
