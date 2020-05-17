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

@WebServlet(value="/controller")
public class TxController  extends HttpServlet{
	
	ApplicationContext ctx;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub

	ctx=new ClassPathXmlApplicationContext("com/wk/config/applicationContext.xml");
	
	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	      BankService proxy=null;
	      proxy=ctx.getBean("bankService",BankService.class);
	      RequestDispatcher rd=null;	
		int srcAcc=Integer.parseInt(req.getParameter("srcAcc"));
		int desAcc=Integer.parseInt(req.getParameter("desAcc"));
		int amount=Integer.parseInt(req.getParameter("amount"));
         String result=proxy.transferMoney(srcAcc, desAcc, amount);
	     req.setAttribute("result", result);
         rd=req.getRequestDispatcher("/result.jsp");
                   
	      rd.forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
doGet(req, res);
	
	
	}
	

}
