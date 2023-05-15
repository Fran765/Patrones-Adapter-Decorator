package eje3.dominio;

public class Carne extends PorcionAdicional {

	private static final Integer PRECIO = 100;

	public Carne(Combo unCombo) {
		super(unCombo);
	}

	@Override
	public void conocerDescripcion() {
		this.miCombo.conocerDescripcion();
		System.out.println(" Carne.");

	}

	@Override
	public Integer conocerPrecio() {
		return (this.miCombo.conocerPrecio() + Carne.PRECIO);

	}

}
