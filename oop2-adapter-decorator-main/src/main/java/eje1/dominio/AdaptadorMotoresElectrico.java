package eje1.dominio;

import java.util.Objects;

public class AdaptadorMotoresElectrico implements Motores {

	private MotorElectrico miMotor;

	public AdaptadorMotoresElectrico(MotorElectrico nuevoMotorElectrico) {
		Objects.requireNonNull(nuevoMotorElectrico);

		this.miMotor = nuevoMotorElectrico;
	}

	@Override
	public void arrancar() {
		miMotor.conectar();
		miMotor.activar();
	}

	@Override
	public void acelerar() {
		miMotor.moverMasRapido();
	}

	@Override
	public void apagar() {
		miMotor.desconectar();
		miMotor.detener();
	}

}
