package com.sls;
import java.util.Random;

public class Mascotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String [] mascotas= new String[1001];
		
		mascotas = new String[1001];
		
	   
		
		for (int i = 0; i < mascotas.length; i++) {
			
			mascotas[i]= generarnombre();
			System.out.println("Hola mi nombre es "+mascotas[i]+". Tu mataste a mi padre. Preparate a morir");
		
		}
		
//Generar nombres de manera aleatoria
		
		
		
		
	
	}//Fin de main
	
	
	public static String generarnombre(){
		
	String[] nombresSueltos =new String[21];
	
	nombresSueltos[0]=  "Peter";
	nombresSueltos[1]=  "Ventoso";
	nombresSueltos[2]=  "Germinal";
	nombresSueltos[3]=  "Floreal";
	nombresSueltos[4]=  "Pradial";
	nombresSueltos[5]=  "Mesidor";
	nombresSueltos[6]=  "Termidor";
	nombresSueltos[7]=  "Fructidor";
	nombresSueltos[8]=  "Vendimiario";
	nombresSueltos[9]=  "Brumario";
	nombresSueltos[10]= "Frimario";
	nombresSueltos[11]= "Nivoso";
	nombresSueltos[12]= "Neron";
	nombresSueltos[13]= "Caligula";
	nombresSueltos[14]= "Augusto";
	nombresSueltos[15]= "Trajano";
	nombresSueltos[16]= "Constantino";
	nombresSueltos[17]= "Teodosio";
	nombresSueltos[18]= "Juliano";
	nombresSueltos[19]= "Vespasiano";
	nombresSueltos[20]= "Adriano";

	
	Random rand = new Random();
    int  n = rand.nextInt(21);
    int  n2 = rand.nextInt(21);
	String nombreaDevolver= nombresSueltos[n]+" "+ nombresSueltos[n2]+" ";
	//A ver como generamos aleatorios y lo usamos para nombres compuestos//
			
		
	return nombreaDevolver;
	
	}
	
	
	
	
	
	}//Fin de class 
