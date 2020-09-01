package com.example.study01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study01.dao.TestDao;
import com.example.study01.vo.TestVO;
@Service("testService")
public class TestService {
	@Autowired
	private TestDao dao;
	
	public List<TestVO> getMold() throws Exception{
		return dao.getMold();
	}
}
