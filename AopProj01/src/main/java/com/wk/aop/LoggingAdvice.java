package com.wk.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("logging advice");
Object[] args=invocation.getArguments();
     
     Object retVal=null;
         if(((Float)args[0])<=0||((Float)args[1])<=0||((Float)args[2])<=0){
        	 throw new IllegalArgumentException("invalid argument");       	 
         }
         
		 if(((Float)args[0])<=5000)
			 args[1]=((Float)args[1])-0.5f;
		 retVal= invocation.proceed();
		 retVal=(Float)retVal+(Float)retVal*0.07f;
		return retVal;
	}

}