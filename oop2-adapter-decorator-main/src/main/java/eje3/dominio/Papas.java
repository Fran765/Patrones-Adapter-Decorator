package eje3.dominio;

public class Papas extends PorcionAdicional {

	private static final Integer PRECIO = 50;

	public Papas(Combo unCombo) {
		super(unCombo);
	}

	@Override
	public void conocerDescripcion() {
		this.miCombo.conocerDescripcion();
		System.out.println(" Papas.");

	}

	@Override
	public Integer conocerPrecio() {
		return (this.miCombo.conocerPrecio() + Papas.PRECIO);
	}

}
