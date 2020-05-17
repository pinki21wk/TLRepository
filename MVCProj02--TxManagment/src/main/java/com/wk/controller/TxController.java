package com.wk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wk.service.BankService;

@WebServlet(value="/controller" ,loadOnStartup=1)
public class TxController  extends HttpServlet{
	
	ApplicationContext ctx=null;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ctx=new ClassPathXmlApplicationContext("/com/wk/config/applicationContext.xml");
		
		
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=null;
		BankService proxy=null;
		int accno=Integer.parseInt(req.getParameter("srcAcno"));
		int amount=Integer.parseInt(req.getParameter("amount"));
		
		proxy=ctx.getBean("bankService", BankService.class);
	String result=proxy.transferMoney(accno, amount);
                
		  req.setAttribute("result", result);
	      rd= req.getRequestDispatcher("/result.jsp");
	       rd.forward(req, res);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

	doGet(req, res);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	
	ctx=null;
	}

}
