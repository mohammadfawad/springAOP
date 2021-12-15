package com.springframework.springAOP.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {//(value = "* com.springframework.springAOP.Serviceimplimentation.ProductServiceImplimentation.multiply(..)")

	@Before ("execution(* com.springframework.springAOP.Serviceimplimentation.ProductServiceImplimentation.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.print("@Before calling Method\n");
	}
	
	@After("execution(* com.springframework.springAOP.Serviceimplimentation.ProductServiceImplimentation.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.print("@After Method Invocation\n");
	}
}
