package com;

public class While {
/*Primero revisa que se cumpla la condición, y ejecuta lo que le pedias, usalo para verificar entradas*/
	public static void main(String[] args) {
		
		int loop=0;
		
		while(loop < 5) {
			System.out.println("Ciclo"+loop);
			/*si yo dejo el código hasta aquí, el bucle o ciclo se repitira infinitamente, 
			 para controlar el ciclo se utilza la función if, break y un iterador
			 (recuerda que el iterador puede ser representado como cualquier variable, en este caso mi iterador se declaró como loop)*/
			
			if(loop == 5) {
				break;
			}
			loop++;
			System.out.println("Ciclo interrumpido"+loop);
		}
		

	}

}
