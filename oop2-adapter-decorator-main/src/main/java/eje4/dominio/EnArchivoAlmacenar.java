package eje4.dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EnArchivoAlmacenar extends Almacenar {

	private File file;

	public EnArchivoAlmacenar(ApiCall miRestCall, String file) {
		super(miRestCall);
		this.file = new File(file);
	}

	@Override
	public String run() throws RegistroException {
		String datos = this.miRestCall.run();

		this.registrar(datos);

		return datos;
	}

	@Override
	public void registrar(String datos) throws RegistroException {

		PrintWriter escribir;
		try {
			escribir = new PrintWriter(this.file);

			escribir.println(datos);

			escribir.close();
		} catch (FileNotFoundException e) {
			throw new RegistroException(e, "No ha podido registrarse el participante en disco.");
		}
	}

}
