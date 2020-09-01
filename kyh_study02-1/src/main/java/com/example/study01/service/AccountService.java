package com.example.study01.service;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.study01.dao.AccountDao;
import com.example.study01.vo.AccountVO;

@Service
public class AccountService implements UserDetailsService{
	
	@Resource
	private AccountDao accounts;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		AccountVO account = new AccountVO();
		try {
			account = accounts.readAccount(username);
			if( account == null ) {
				throw new UsernameNotFoundException(username);
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account;
	}
};