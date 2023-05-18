package eje4.dominio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnBaseAlmacenar extends Almacenar {

	private Conn connStr;

	public EnBaseAlmacenar(ApiCall miRestCall, String connStr) {
		super(miRestCall);
		this.connStr = new Conn(connStr);
	}

	@Override
	public String run() throws RegistroException {
		String datos = this.miRestCall.run();

		this.registrar(datos);

		return datos;
	}

	@Override
	public void registrar(String datos) throws RegistroException {
		try {
			Connection dbConn = this.connStr.open();

			PreparedStatement st = dbConn.prepareStatement("insert into datos_llamada (datos) values(?)");

			st.setString(1, datos);

			st.executeUpdate();
			st.close();

		} catch (SQLException e) {
			throw new RegistroException(e, "No ha podido registrarse el participante en base.");
		}

	}

}
