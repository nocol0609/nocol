package com.nocol.pattern.behavior.Visitor;

//访问者的�?个具体实�?
public class MyVisitor implements Visitor {  
    public void visit(Subject sub) {  
        System.out.println("visit the subject�?"+sub.getSubject());  
    }  
}  
