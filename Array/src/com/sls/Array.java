package com.sls;

import javax.swing.plaf.FontUIResource;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definiendo arrays
		
		String [] meses= new String[12];
		
		meses = new String[12];
		
		meses[0]=  "Pluvioso";
		meses[1]=  "Ventoso";
		meses[2]=  "Germinal";
		meses[3]=  "Floreal";
		meses[4]=  "Pradial";
		meses[5]=  "Mesidor";
		meses[6]=  "Termidor";
		meses[7]=  "Fructidor";
		meses[8]=  "Vendimiario";
		meses[9]=  "Brumario";
		meses[10]= "Frimario";
		meses[11]= "Nivoso";
		
		
		for (int i = 0; i < meses.length; i++) {
			System.out.println (i+" de "+meses[i]);
		}
		
		
		
		for (String unMes : meses) {
			System.out.println("Un mes: "+unMes);
		
		}
		
		
		
		//La parte de las mascotas
		
		
		
		
		
		
	
	}
	
	


}
