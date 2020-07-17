package com;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/*   
La instrucci�n switch es una instrucci�n de m�ltiples v�as. Proporciona una forma sencilla de enviar 
la ejecuci�n a diferentes partes del c�digo en funci�n del valor de la expresi�n. B�sicamente, 
la expresi�n puede ser tipos byte, short, char e int, String y Wrapper.
	Los valores duplicados de los case no est�n permitidos.
    El valor para un case debe ser del mismo tipo de datos que la variable en el switch.
    El valor para un case debe ser una constante o un literal. Las variables no est�n permitidas.
    La declaraci�n break se usa dentro del switch para finalizar una secuencia de instrucci�n.
    La declaraci�n break es opcional. Si se omite, la ejecuci�n continuar� en el siguiente case.
    La instrucci�n default es opcional, y debe aparecer al final del switch.*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire un numero del giorno della settimana");
		int day = scanner.nextInt();
		String dayString;
		String dayType;
		
		//instruccion switch con tipo de dato int
		switch(day)
		{
		
		case 1: dayString = "Luned�";
				break;
		case 2: dayString = "Marted�";
				break;
		case 3: dayString = "Mercoled�";
				break;
		case 4: dayString = "Gioved�";
				break;
		case 5: dayString = "Venerd�";
				break;
		case 6: dayString = "Sabato";
				break;
		case 7: dayString = "Domenica";
				break;
		default: dayString = "Giorno non valido";
		
		}
		switch (day)
		{
		//multiples cases sin declaraci�n break
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
		System.out.println(dayString + " � un " + dayType);
	}
}
