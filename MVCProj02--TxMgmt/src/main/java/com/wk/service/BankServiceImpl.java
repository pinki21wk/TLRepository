package com.wk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wk.dao.DepositeDAO;


@Service("bankService")
public class BankServiceImpl implements BankService {


	        @Autowired
	      private DepositeDAO dao;
	
	public String transferMoney(int srcAcc, int desAcc, int amount) {

	      int count=dao.deposit(srcAcc, amount);
		       System.out.println(count);
		return "successs";
	}

	
}
