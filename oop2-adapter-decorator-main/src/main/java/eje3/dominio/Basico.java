package eje3.dominio;

public class Basico implements Combo {

	private static final String DESCRIPCION = "Combo basico: hamburguesa, tomate, queso, papas.";
	private static final Integer PRECIO = 400;

	@Override
	public void conocerDescripcion() {
		System.out.println(DESCRIPCION);
	}

	@Override
	public Integer conocerPrecio() {
		return Basico.PRECIO;
	}

}
