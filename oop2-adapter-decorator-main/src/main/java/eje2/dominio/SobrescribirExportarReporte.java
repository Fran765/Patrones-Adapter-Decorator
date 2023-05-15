package eje2.dominio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SobrescribirExportarReporte implements ExportarReporte {

	private ExportarReporte exportacion;

	public SobrescribirExportarReporte(ExportarReporte exportacion) {
		this.exportacion = exportacion;
	}

	@Override
	public void export(File file) {

		this.limpiarArchivo(file);

		this.exportacion.export(file);

	}

	private void limpiarArchivo(File file) {

		try (FileWriter escribir = new FileWriter(file)) {

			RandomAccessFile random = new RandomAccessFile(file, "rw");
			random.setLength(0);

			escribir.close();
			random.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
