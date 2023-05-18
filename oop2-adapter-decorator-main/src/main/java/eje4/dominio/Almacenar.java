package eje4.dominio;

public abstract class Almacenar implements ApiCall{
	
	protected ApiCall miRestCall;
	
	public Almacenar(ApiCall miRestCall) {
		this.miRestCall = miRestCall;
	}
	
	public abstract void registrar(String datos) throws RegistroException;

}
