package com.sls.models; //Esto no es ejecutable, solo la definicion de un concepto
public class Usuario {

	public String nombre;
	public String apellido;
	public String email;
	public int edad;

	public String getDatosCompletos() {
		
		String datos =this.nombre+" "+this.apellido+" "+this.email+" "+this.edad+". ";
		return datos;
	}
}
