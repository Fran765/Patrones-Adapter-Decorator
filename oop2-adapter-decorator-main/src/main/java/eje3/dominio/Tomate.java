package eje3.dominio;

public class Tomate extends PorcionAdicional {

	private static final Integer PRECIO = 20;

	public Tomate(Combo unCombo) {
		super(unCombo);
	}

	@Override
	public void conocerDescripcion() {
		this.miCombo.conocerDescripcion();
		System.out.println(" Tomate.");
	}

	@Override
	public Integer conocerPrecio() {
		return (this.miCombo.conocerPrecio() + Tomate.PRECIO);
	}

}
