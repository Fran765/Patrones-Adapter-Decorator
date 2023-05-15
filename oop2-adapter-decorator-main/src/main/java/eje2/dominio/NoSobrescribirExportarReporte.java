package eje2.dominio;

import java.io.File;

public class NoSobrescribirExportarReporte implements ExportarReporte {

	private ExportarReporte exportacion;

	public NoSobrescribirExportarReporte(ExportarReporte exportacion) {
		this.exportacion = exportacion;
	}

	@Override
	public void export(File file) {

		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}

		this.exportacion.export(file);

	}

}
