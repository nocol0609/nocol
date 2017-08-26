package com.nocol.pattern.behavior.Visitor;

//被访问�?�的�?个具体实�?
public class MySubject implements Subject {  
    public void accept(Visitor visitor) {  
        visitor.visit(this);  
    }  
    public String getSubject() {  
        return "love";  
    }  
} 
