package com.nocol.pattern.behavior.Observer;

//被观察�?�接�?
public interface Subject {  
      
    /*增加观察�?*/  
    public void add(Observer observer);  
      
    /*删除观察�?*/  
    public void del(Observer observer);  
      
    /*通知�?有的观察�?*/  
    public void notifyObservers();  
      
    /*自身的操�?*/  
    public void operation();  
}  
