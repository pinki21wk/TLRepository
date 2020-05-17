package com.wk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wk.dao.DepositeDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {

	@Autowired
	private DepositeDAO dao;
	
	public String transferMoney(int accno, int amount) {
		// TODO Auto-generated method stub
		
		
		int cnt=dao.deposite(accno, amount);
		return "success";
	}

}
