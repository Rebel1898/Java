package com.sls;

public class Decisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=50;
		b=50;
		c=50;
		
		
		
		if ((a>b)&&(a>c)){ System.out.println("A es el mayor");
		}else if ((b>a)&&(b>c)) {System.out.println("B es el mayor");
		}else if ((c>a)&&(c>b)) {System.out.println("C es el mayor");
		}else if ((a==b)&&(b>c)) {System.out.println("A y B son iguales y mayores que C");
		}else if ((b==c)&&(b>a)) {System.out.println("B y C son iguales y mayores que A");
		}else if ((a==c)&&(a>c)) {System.out.println("A y C son iguales y mayores que B");
		}else if ((a==b)&&(b==c)) {System.out.println("Todos somos iguales. Marx estaria orgulloso");
		}else{System.out.println("No hay mas opciones, pipa");}		
	}}


