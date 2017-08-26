package com.test_09;

class OwnException extends Exception {

	public OwnException() {
		// TODO Auto-generated constructor stub
	}

	public OwnException(String message) {
		super(message);
	}

}

class OwnExceptionSource {

	public void a() throws OwnException {
		
		throw new OwnException("”–“Ï≥£");
	}

}

public class OwnExceptionHandler {
	public static void main(String[] args) {

		OwnExceptionSource os = new OwnExceptionSource();

		try {
			os.a();
		} catch (OwnException e) {
			System.out.println(e.getMessage());
		}
	}
}
