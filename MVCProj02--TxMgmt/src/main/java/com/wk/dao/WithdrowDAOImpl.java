package com.wk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WithdrowDAOImpl implements WithdrowDAO {
	private static final String WITHDROW_QUERY="UPDATE  dtx_account2 SET balance=balance-? WHERE accno=?"; 
	@Autowired
	private JdbcTemplate pjt;
	
	public int withdrow(int accno, int amount) {
		// TODO Auto-generated method stub
		
		int count=pjt.update(WITHDROW_QUERY, amount,accno);
		count=2;
		return count;
	}
	
	

}