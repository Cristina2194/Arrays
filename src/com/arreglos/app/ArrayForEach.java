package com.arreglos.app;

public class ArrayForEach {

	public static void main(String[] args) {
		//Sirve para mostrar todo el contenido que puede tener todo el arreglo

		String[] name = {"Cristina", "Nina", "Moni", "Yoli"};
		
	/*For simple
		for(int i=0; i<name.length; i++) {
			length es una función que me ayuda cuando no sé el tamaño de arreglo
			 no hay necesidad de especificar
			System.out.println(name[i]);
			*/
	/*For each*/
			for(String i: name) {
				System.out.println("Name: "+ i);
		}
	}

}
