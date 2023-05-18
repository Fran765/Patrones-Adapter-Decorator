	package eje4.dominio;

public class RegistroException extends Exception{
	
	public RegistroException(Exception ex, String msg) {
	    super(msg, ex);
	  }

}
