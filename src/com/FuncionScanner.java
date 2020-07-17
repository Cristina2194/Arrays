package com;

import java.util.Scanner;

public class FuncionScanner {

	public static void main(String[] args) {
		

		
		//Crear el objeto scanner que permite a la consola leer datos que son ingresados 
		
		Scanner input = new Scanner(System.in);
		
/*---Solicitar al usurio lo que debe ingresar:
		Solicitar al usuario una linea de texto
		Ingresar linea de texto o dato numerico*/
		System.out.println("Ingresa una tu nombre completo");
		//La consola lee lo que ingresa el usuario
		String nombre = input.nextLine();
		
		System.out.println("Ingresa tu edad: ");
		int edad = input.nextInt();
		
		System.out.println("Ingresa tu estatura: ");
		double estatura=input.nextDouble();
		
		//Mostrar lo que ingreso el usuario
		System.out.println("Hola, mi nombre es: " + nombre);
		System.out.println("Tengo: "+edad+" años");
		System.out.println("Mido: "+estatura);

		
	}

}
