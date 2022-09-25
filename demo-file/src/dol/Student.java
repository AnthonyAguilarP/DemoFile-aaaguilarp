package dol;

import java.util.Date;

public class Student extends Person{

	private String NumCarnet;
	private Date FechaInscripcion;
	
	public Student(Date fechaInscripcion) {
		super();
		FechaInscripcion = fechaInscripcion;
	}

	public String getNumCarnet() {
		return NumCarnet;
	}

	public void setNumCarnet(String NumCarnet) {
		this.NumCarnet = NumCarnet;
	}

	public Date getFechaInscripcion() {
		return FechaInscripcion;
	}

	public void setFechaInscripcion(Date FechaInscripcion) {
		this.FechaInscripcion = FechaInscripcion;
	}

}
