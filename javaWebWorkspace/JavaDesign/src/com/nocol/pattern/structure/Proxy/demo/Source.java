package com.nocol.pattern.structure.Proxy.demo;

//目标�?/被代理类
public class Source implements Sourceable {  
  
    public void method() {  
        System.out.println("真正要执行代�?");  
    }  
}