package com.strategy;

import java.util.Arrays;


/**
 * @author lxp
 *
 * @TODO
 * 
 */
// ���������ʵ�ֲ��Խӿ�
public class StrategyThree implements ComputableStrategy {

	@Override
	public double computableScore(double[] a) {// ��������a��ȥ�����ֵ����Сֵ��Ĵ���ƽ��ֵ
		// TODO Auto-generated method stub

		// ������a��������
		Arrays.sort(a);

		double Score = 0, Sum = 0;
		if (a.length <= 2) {
			return 0;
		} else {
			for (int i = 1; i < a.length - 1; i++) {
				Sum += a[i];
			}
			Score = Sum / (a.length - 2);
		}
		return Score;
	}

}
