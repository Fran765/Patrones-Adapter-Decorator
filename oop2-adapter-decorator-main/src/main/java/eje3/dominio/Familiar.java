package eje3.dominio;

public class Familiar implements Combo {

	private static final String DESCRIPCION = "Combo familiar: 4 hamburguesas, 4 tomates, 4 quesos, 4 papas.";
	private static final Integer PRECIO = 1200;

	@Override
	public void conocerDescripcion() {
		System.out.println(DESCRIPCION);
	}

	@Override
	public Integer conocerPrecio() {
		return Familiar.PRECIO;
	}

}
