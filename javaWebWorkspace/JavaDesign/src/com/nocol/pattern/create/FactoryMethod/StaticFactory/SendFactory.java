package com.nocol.pattern.create.FactoryMethod.StaticFactory;

//创建工厂�?
public class SendFactory {  
  
	public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }   
} 	
