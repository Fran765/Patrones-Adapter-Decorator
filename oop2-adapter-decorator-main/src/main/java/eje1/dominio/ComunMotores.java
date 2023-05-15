package eje1.dominio;

public class ComunMotores implements Motores {

	@Override
	public void arrancar() {
		System.out.println("Se ha arrancado el motor comun.");
	}

	@Override
	public void acelerar() {
		System.out.println("Se esta acelerando el motor comun.");
	}

	@Override
	public void apagar() {
		System.out.println("Se ha apagado el motor comun.");
	}

}
