package eje3.main;

import java.util.ArrayList;
import java.util.List;

import eje3.dominio.Basico;
import eje3.dominio.Carne;
import eje3.dominio.Combo;
import eje3.dominio.Especial;
import eje3.dominio.Familiar;
import eje3.dominio.Papas;
import eje3.dominio.Queso;
import eje3.dominio.Tomate;

public class Main {

	public static void main(String[] args) {

		List<Combo> combosPrueba = new ArrayList<>();

		Combo basico = new Tomate(new Papas(new Carne(new Tomate(new Basico()))));
		Combo especial = new Carne(new Queso(new Papas(new Especial())));
		Combo familiar = new Familiar();

		combosPrueba.add(basico);
		combosPrueba.add(especial);
		combosPrueba.add(familiar);

		for (Combo unCombo : combosPrueba) {
			System.out.println("\n### Combo ###\n Descripcion: ");
			unCombo.conocerDescripcion();
			System.out.println("Precio total: " + unCombo.conocerPrecio());
		}

	}

}
