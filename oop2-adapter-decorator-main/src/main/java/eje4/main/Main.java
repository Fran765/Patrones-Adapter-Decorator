package eje4.main;

import eje4.dominio.ApiCall;
import eje4.dominio.EnArchivoAlmacenar;
import eje4.dominio.EnBaseAlmacenar;
import eje4.dominio.RegistroException;
import eje4.dominio.RestCall;

public class Main {
	public static void main(String[] args) {
		ApiCall rest = new EnArchivoAlmacenar(new EnBaseAlmacenar(new RestCall("https://jsonplaceholder.typicode.com/posts"), "jdbc:mysql://localhost:3306/oop2-adapter-call"), "RegistroPunto4");
		try {
			System.out.println(rest.run());
		} catch (RegistroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
