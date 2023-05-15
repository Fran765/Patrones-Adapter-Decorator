package eje1.main;

import java.util.ArrayList;
import java.util.List;

import eje1.dominio.AdaptadorMotoresElectrico;
import eje1.dominio.ComunMotores;
import eje1.dominio.EconomicoMotores;
import eje1.dominio.MotorElectrico;
import eje1.dominio.Motores;

public class Main {

	public static void main(String[] args) {

		List<Motores> misMotores = new ArrayList<>();
		Motores comun = new ComunMotores();
		Motores economico = new EconomicoMotores();

		MotorElectrico electrico = new MotorElectrico();
		Motores adaptadorElectrico = new AdaptadorMotoresElectrico(electrico);

		misMotores.add(comun);
		misMotores.add(economico);
		misMotores.add(adaptadorElectrico);

		for (Motores motor : misMotores) {
			System.out.println("\n### Cambio de motor ###");
			motor.arrancar();
			motor.acelerar();
			motor.apagar();
		}

	}

}
