package com.wk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wk.service.BankService;

public class AopBankServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService proxy=null;
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("/com/wk/config/applicationContext.xml");
		
		
		
		
		 proxy=ctx.getBean("pfb",BankService.class);
		 System.out.println(proxy.calCompoundIntr(100000, 2, 1));
		 System.out.println(proxy.getClass()+"---------"+proxy.getClass().getSuperclass());
		
		 System.out.println(proxy.calCompoundIntr(100000, 2, 1));
		 System.out.println(proxy.calCompoundIntr(100000, 2, 1));

	}

}