package com.sls;
import com.sls.models.Usuario;

public class Principal {
	
	public static void main(String[] args) {
		
		Usuario pepito =new Usuario();
		pepito.nombre="Horse";
		pepito.apellido="Ramon";
		pepito.email="Horse@pony.la";
		pepito.edad=70;
		
				
		System.out.println(pepito.nombre+" "+pepito.apellido+" "+pepito.email+" "+pepito.edad);
		System.out.println(pepito.getDatosCompletos());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
