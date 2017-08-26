package com.test;

interface  A{
	abstract void testA();
}

abstract class Gender1 implements A {
	
	private static final Gender1 FEMALE=new Gender1("FEMAL"){

		@Override
		public void testA() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void desc() {
			// TODO Auto-generated method stub
			
		}};
		
	private static final Gender1 MALE=new Gender1("MALE"){

		@Override
		public void testA() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void desc() {
			// TODO Auto-generated method stub
			
		}};
	
	private String name;
	private Gender1(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	abstract void desc();
}

//--------------------------------------------------------------------

enum Gender implements A{
	FEMAL(0) {
		@Override
		void test() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void testA() {
			// TODO Auto-generated method stub
			
		}
	}, MALE(1) {
		@Override
		void test() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void testA() {
			// TODO Auto-generated method stub
			
		}
	};
	private int id;
	private Gender(int id){
		this.id=id;
	}
	abstract void test();
}

public class EnumTest {
	public static void main(String[] args) {
		Gender gender = Gender.MALE;
		System.out.println(gender);
		System.out.println(gender.name());
		System.out.println(gender.ordinal());
		
		Gender[] values = Gender.values();
		for (Gender gender2 : values) {
			System.out.println(gender2);
		}
		
		switch (gender) {
		//switch在case语句中在获取enum类型值时,可以省略类型前缀
		case MALE:
			
			break;
			
		case FEMAL:
			
			break;

		default:
			break;
		}
	}
}
