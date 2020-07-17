package com;

public class Arrays {

	public static void main(String[] args) {
		/*Arrays Unidimensionales
		 * puedes declarar tipo de datos int, long, float, double, boolean, char, String
		 Recuerda que los arreglos inician en 0;
		 Sintaxis
		 Tipo de variable [] Nombre del array = new Tipo de variable [dimensón];
		 */
	/*Ejemplo
		Para dar valores a un array existen dos formas, en la primera se agregan los 
		valores manualmente como acontinuación.
		int[] edad = new int[4];
		edad[0] =5;
		edad[1]=7;
		edad[2]=9;
		Lo que esta entre [en este caso, representa 
		el lugar que ocupa el valor asigando(indice)]*/
	/*La segunda forma es*/
		int[] number = {6,8,10};
		
		for(int i=0; i<3; i++) {
			System.out.println(number[i]);
		}
	}

}
