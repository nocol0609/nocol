package com.nocol.pattern.behavior.Visitor;

//è¢«è®¿é—®è?…æ¥å?
public interface Subject {  
    public void accept(Visitor visitor);  
    public String getSubject();  
}  
