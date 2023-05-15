package eje4.main;

import eje4.dominio.RestCall;

public class Main {
	public static void main(String[] args) {
		RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");
		System.out.println(rest.run());
	}
}
