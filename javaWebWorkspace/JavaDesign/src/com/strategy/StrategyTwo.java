package com.strategy;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// ������Զ�ʵ�ֲ��Խӿ�
public class StrategyTwo implements ComputableStrategy {

	@Override
	public double computableScore(double[] a) {// ��������a��Ԫ�صļ���ƽ����
		// TODO Auto-generated method stub
		double Score = 0, Multi = 1;
		for (int i = 0; i < a.length; i++) {
			Multi = Multi * a[i];
		}
		Score = Math.pow(Multi, 1.0 / (a.length));
		return Score;
	}
}
