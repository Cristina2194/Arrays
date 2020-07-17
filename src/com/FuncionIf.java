package com;

public class FuncionIf {

	public static void main(String[] args) {
		/*Primero declar una variable*/
		int precioDisco=17;
		
		
		/*Segundo, es declarar una condición, si precioDisco es menor o igual a 15, la consula dira: compralo*/
		
			if(precioDisco <= 15) {
				System.out.println("¡Compralo!");
				
				
			}
			/*Tercero, si la primera condición no se cumple entonces cae en otra condición: 
			 si no es si precioDisco es mayor a 20 la consola dira: no lo compres */
			else if(precioDisco > 20) {
				System.out.println("¡No lo compres!");
			
			}
			/*Tercero, cuando no se cumple ni la primera ni la segunda condición, entonces la consola dira: piensa ¿lo necesitas?*/
			
			else {
				System.out.println("Piensa, ¿Lo necesito?");
			}

	}

}
