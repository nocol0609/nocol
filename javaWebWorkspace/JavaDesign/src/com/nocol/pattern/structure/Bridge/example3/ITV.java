package com.nocol.pattern.structure.Bridge.example3;

//ç”µè§†æœºæ¥å?
public interface ITV {
	public void on();//å¼?
    public void off();//å…?
    public void switchChannel(int channel);//æ¢é¢‘é?
}

class SamsungTV implements ITV {
    @Override
    public void on() {
        System.out.println("Samsung is turned on.");
    }
    @Override
    public void off() {
        System.out.println("Samsung is turned off.");
    }
    @Override
    public void switchChannel(int channel) {
        System.out.println("Samsung: channel - " + channel);
    }
}

class SonyTV implements ITV {
	 
    @Override
    public void on() {
        System.out.println("Sony is turned on.");
    }
 
    @Override
    public void off() {
        System.out.println("Sony is turned off.");
    }
 
    @Override
    public void switchChannel(int channel) {
        System.out.println("Sony: channel - " + channel);
    }
}

