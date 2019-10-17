package com.nanshufang.win.client.demo.common.utils;


import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.CodeSignature;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;


@Aspect
public class LogMonitor {
    static final String NEW_TAB="\t";

    @Pointcut("(execution(* com.hjl.win.client.demo..*.*(..))) && !(execution(* com.nanshufang.win.client.demo.common.utils.LogMonitor.*(..)))")
    public void excute(){ }

    @Before("excute()")
    public void beforeMethod(JoinPoint joinPoint){
//        System.out.println("方法执行之前");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        //类名称
        String className=joinPoint.getSignature().getDeclaringTypeName();
        String msg = "";
        msg+=className; //先获取类名称
        msg+=".";
        msg += method.getName() + "(";
        String praramStr="";

        Object[] paramValues = joinPoint.getArgs();
        String[] paramNames = ((CodeSignature) joinPoint.getSignature()).getParameterNames();
        int parameterLength=paramNames.length;
        for(int i=0;i<parameterLength;i++){
            if(StringUtils.isBlank(praramStr)){
                praramStr=paramNames[i]+"="+paramValues[i];
            }else{
                praramStr=praramStr+", "+paramNames[i]+"="+paramValues[i];
            }
        }
        msg+=praramStr;
        msg+=")";
        log(msg);
    }

    //后置增强
    @AfterReturning("execution(* DemoAspect.*.doGet(..))")
    public void myAfter(){
        System.out.println("===end===");
    }

    //环绕增强
    @Around("execution(* DemoAspect.*.sayhi(..))")
    public void myArpund(ProceedingJoinPoint point) throws Throwable {
        System.out.println("我在上边");
        point.proceed();
        System.out.println("我在下边");
    }

    private void log(String msg) {
        System.out.println(NEW_TAB+msg);
    }
}


