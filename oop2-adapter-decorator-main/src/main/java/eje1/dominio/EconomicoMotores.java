package eje1.dominio;

public class EconomicoMotores implements Motores {

	@Override
	public void arrancar() {
		System.out.println("Se ha arrancado el motor economico.");
	}

	@Override
	public void acelerar() {
		System.out.println("Se esta acelerando el motor economico.");
	}

	@Override
	public void apagar() {
		System.out.println("Se ha apagado el motor economico.");
	}

}
