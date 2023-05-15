package eje2;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import eje2.dominio.NoSobrescribirExportarReporte;
import eje2.dominio.Report;
import eje2.dominio.SobrescribirExportarReporte;

class ReportTest {

	@Test
	void registrarArchivoExistente() {

		File archivo = new File("Registro");

		NoSobrescribirExportarReporte miReporte = new NoSobrescribirExportarReporte(
				new Report(LocalDate.now().toString()));

		assertThrows(RuntimeException.class, () -> miReporte.export(archivo));

	}

	@Test
	void registrarArchivoNoExistente() {

		Report miReporte = new Report(LocalDate.now().toString());

		assertThrows(RuntimeException.class, () -> miReporte.export(null));
	}

	@Test
	void registrarArchivo() {

		File archivo = new File("Registro");

		SobrescribirExportarReporte miReporte = new SobrescribirExportarReporte(new Report(LocalDate.now().toString()));

		try {
			miReporte.export(archivo);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

		assertDoesNotThrow(() -> miReporte.export(archivo));

	}

}
