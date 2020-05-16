package com.wk.aop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class CacheAdvice implements MethodInterceptor {

	private Map<String,Object> cache=new HashMap<String,Object>();
	  
	

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub

	System.out.println("entry");

		String key=null;
		Object retVal=null;
		key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		 
		if(!cache.containsKey(key)) {
			retVal=invocation.proceed();
			cache.put(key, retVal);
			System.out.println("cache advice method");
		}
		return cache.get(key);
	}

}
