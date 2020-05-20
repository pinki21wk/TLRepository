package com.wk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wk.dao.DepositeDAO;
import com.wk.dao.WithdrowDAO;


@Service("bankService")
public class BankServiceImpl implements BankService {


	        @Autowired
	      private DepositeDAO dao;
	        @Autowired
	        private WithdrowDAO wDao;
	
	        @Transactional(propagation=Propagation.REQUIRED ,readOnly=true)
	public String transferMoney(int srcAcc, int desAcc, int amount) {
           int count1=wDao.withdrow(srcAcc, amount);
           int count=dao.deposit(desAcc, amount);
           /*try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       	   
          
        	   
        	   int x=1/0;*/
        	   
          
           
	      
		return "successs";
	}

	
}
