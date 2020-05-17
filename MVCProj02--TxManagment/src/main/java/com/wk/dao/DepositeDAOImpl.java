package com.wk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepositeDAOImpl implements DepositeDAO {

	 private static final String DEPOSITE="UPDATE TABLE DTX_ACCOUNT SET AMT=AMT+? WHERE ACCNO=?";
	  @Autowired
	  @Qualifier(value="oraTemplate")
	  private JdbcTemplate jt;

	public int deposite(int accno, int amount) {
		// TODO Auto-generated method stub
		//int cnt=jt.update(DEPOSITE,amount,accno);
		return 1;
		//return cnt;
	}
	

}