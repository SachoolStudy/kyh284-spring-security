package com.example.study01.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.study01.vo.AccountVO;

@Mapper
public interface AccountDao {
	public AccountVO readAccount(String username) throws Exception;
}