package Test;

class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.catchTest();
	
	}

	private void catchTest() {
		// TODO Auto-generated method stub
		try {
			System.out.println("A");
			int c = 10 / 0;
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
	}
}
