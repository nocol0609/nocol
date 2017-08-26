package com.test;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLTest {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8088");
		URLConnection conn = url.openConnection();
		Scanner sc = new Scanner(conn.getInputStream());
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
