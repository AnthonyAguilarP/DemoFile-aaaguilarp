package dol;

import java.util.Date;

public class Student extends Person{

	private int NumCarnet;
	private Date FechaInscripcion;
	
	public Student(Date fechaInscripcion) {
		super();
		FechaInscripcion = fechaInscripcion;
	}

	public int getNumCarnet() {
		return NumCarnet;
	}

	public void setNumCarnet(int NumCarnet) {
		this.NumCarnet = NumCarnet;
	}

	public Date getFechaInscripcion() {
		return FechaInscripcion;
	}

	public void setFechaInscripcion(Date FechaInscripcion) {
		this.FechaInscripcion = FechaInscripcion;
	}

}
