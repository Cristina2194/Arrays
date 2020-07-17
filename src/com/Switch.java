package com;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/*   
La instrucción switch es una instrucción de múltiples vías. Proporciona una forma sencilla de enviar 
la ejecución a diferentes partes del código en función del valor de la expresión. Básicamente, 
la expresión puede ser tipos byte, short, char e int, String y Wrapper.
	Los valores duplicados de los case no están permitidos.
    El valor para un case debe ser del mismo tipo de datos que la variable en el switch.
    El valor para un case debe ser una constante o un literal. Las variables no están permitidas.
    La declaración break se usa dentro del switch para finalizar una secuencia de instrucción.
    La declaración break es opcional. Si se omite, la ejecución continuará en el siguiente case.
    La instrucción default es opcional, y debe aparecer al final del switch.*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire un numero del giorno della settimana");
		int day = scanner.nextInt();
		String dayString;
		String dayType;
		
		//instruccion switch con tipo de dato int
		switch(day)
		{
		
		case 1: dayString = "Lunedì";
				break;
		case 2: dayString = "Martedì";
				break;
		case 3: dayString = "Mercoledì";
				break;
		case 4: dayString = "Giovedì";
				break;
		case 5: dayString = "Venerdì";
				break;
		case 6: dayString = "Sabato";
				break;
		case 7: dayString = "Domenica";
				break;
		default: dayString = "Giorno non valido";
		
		}
		switch (day)
		{
		//multiples cases sin declaración break
		case 1:
		case 2:
		case 3:
		case 4:	
		case 5:
			dayType = "Giorno lavorativo";
			break;
		case 6: 
		case 7:
			dayType = "Fine settimana";
			
			default: dayType = "Giorno non valido";
			
		}
		System.out.println(dayString + " è un " + dayType);
	}
}
