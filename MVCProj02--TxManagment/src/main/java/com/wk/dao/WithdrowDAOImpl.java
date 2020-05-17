package com.wk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class WithdrowDAOImpl implements WithdrowDAO {

	@Autowired
	 @Qualifier(value="pgJt")
	  private JdbcTemplate jt;
	
	public int withdrow(int accno, int amount) {
		// TODO Auto-generated method stub
	     	
		
		
		
		return 0;
	}

}
