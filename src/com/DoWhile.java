package com;

import java.util.Scanner;

public class DoWhile {
/*Es parecido al while, la diferencia es que en este caso primero ejecuta y después 
 * verifica que se cumpla la condición, usalo como condicion de salida*/
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		
		int value =0;
		do {
			System.out.println("Ingresa un numero entero:");
			value = scanner.nextInt();
		}
		while(value !=5);/*Mientras el usuario no ingrese el numero 5, la consola seguira pediendo al usuario que ingrese un numero*/
		System.out.println();
		
		
	}

}
