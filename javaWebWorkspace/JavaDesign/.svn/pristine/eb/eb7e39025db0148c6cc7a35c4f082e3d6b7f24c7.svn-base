package com.nocol.pattern.behavior.Observer;

import java.util.Iterator;
import java.util.Vector;

//被观察�?�的�?个抽象实�? 提供基本的实�?
public abstract class AbstractSubject implements Subject {  
  
    private Vector<Observer> vector = new Vector<Observer>();  
    public void add(Observer observer) {  
        vector.add(observer);  
    }  
  
    public void del(Observer observer) {  
        vector.remove(observer);  
    }  
  
    public void notifyObservers() {  
        Iterator<Observer> it = vector.iterator();
        while(it.hasNext()){
			Observer next = it.next();
			next.update();
        }
    }  
}
