package com.wk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepositeDAOImpl implements DepositeDAO {
	
	private static final String DEPOSITE_QUERY="UPDATE  DTX_ACCOUNT SET balance=balance+? WHERE accno=?"; 
	
	@Autowired
	private JdbcTemplate jt;
	          

	public int deposit(int accno, int amount) {
		// TODO Auto-generated method stub
		
		int count=jt.update(DEPOSITE_QUERY,amount,accno);
		return count;
		
	}

	
	
	
}
