package com.simplefactory;
/**
* @author lxp
*
* @TODO 
* 
*/
//���������̳в�������
public class DivOperation extends OperationFactory  {
	@Override
	public double getResult(){
		// TODO Auto-generated method stub
		if(numberb==0){
			throw new IllegalArgumentException("��������Ϊ��");
		}else {
			return numbera/numberb;
		}
	}
}
