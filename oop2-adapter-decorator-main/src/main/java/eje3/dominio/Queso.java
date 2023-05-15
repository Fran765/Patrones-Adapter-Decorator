package eje3.dominio;

public class Queso extends PorcionAdicional {

	private static final Integer PRECIO = 70;

	public Queso(Combo unCombo) {
		super(unCombo);
	}

	@Override
	public void conocerDescripcion() {
		this.miCombo.conocerDescripcion();
		System.out.println(" Queso.");

	}

	@Override
	public Integer conocerPrecio() {
		return (this.miCombo.conocerPrecio() + Queso.PRECIO);
	}

}
