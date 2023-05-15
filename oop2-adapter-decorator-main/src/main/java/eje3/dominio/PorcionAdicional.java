package eje3.dominio;

public abstract class PorcionAdicional implements Combo{
	
	protected Combo miCombo;
	
	public PorcionAdicional(Combo unCombo) {
		this.miCombo = unCombo;
	}
	
	public abstract void conocerDescripcion();
	
	public abstract Integer conocerPrecio();
	
}
