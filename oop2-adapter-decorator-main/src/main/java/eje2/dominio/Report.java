package eje2.dominio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Report implements ExportarReporte {

	private FileWriter escribir;
	private PrintWriter lineaEscritura;
	private String reporte;

	public Report(String reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file){
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}

		try {
			this.escribir = new FileWriter(file);
			lineaEscritura = new PrintWriter(escribir);
			lineaEscritura.println(reporte);
			
		} catch (IOException e) {
			throw new IllegalArgumentException("Error al escribir el archivo: " + e.getMessage());
		} finally {
			try {
				this.escribir.close();
				this.lineaEscritura.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}
}
