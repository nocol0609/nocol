package com.nocol.pattern.structure.Bridge.example3;

//抽象的遥控器�?  包含对ITV类型对象的引用�??
public abstract class AbstractRemoteControl {
    private ITV tv;
 
    public AbstractRemoteControl(ITV tv){
        this.tv = tv;
    }
 
    public void turnOn(){
        tv.on();
    }
 
    public void turnOff(){
        tv.off();
    }
 
    public void setChannel(int channel){
        tv.switchChannel(channel);
    }
}

//自定义的遥控器类
class MyRemoteControl extends AbstractRemoteControl {
	 
    public MyRemoteControl(ITV tv) {
        super(tv);
    }
 
    public void setChannelKeyboard(int channel){
        setChannel(channel);
        System.out.println("使用遥控器的按键进行了换频道");
    }
}

