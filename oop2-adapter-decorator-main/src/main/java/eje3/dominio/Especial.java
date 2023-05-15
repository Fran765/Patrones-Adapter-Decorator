package eje3.dominio;

public class Especial implements Combo {

	private static final String DESCRIPCION = "Combo especial: 2 hamburguesas, 2 tomates, 2 quesos, 2 papas.";
	private static final Integer PRECIO = 800;

	@Override
	public void conocerDescripcion() {
		System.out.println(DESCRIPCION);
	}

	@Override
	public Integer conocerPrecio() {
		return Especial.PRECIO;
	}

}
