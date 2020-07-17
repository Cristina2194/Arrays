package com.arreglos.app;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayFor {
/*Llenar arreglos sin saber el # de elementos y cuales son sus elementos*/
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		
		/*crear una variable para almacenar el 
		numero de elementos que va a contener*/

		int odd;
		int nElements;
		/*Pedir al usuario el numero de elementos que quiere para el arreglo*/
		nElements =Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos que desea que contenga su arreglo"));
		//La funcion JOptionPane.showInputDialog es para que aparesca una ventana de dialogo
		/*Crear el arreglo*/
		char[] letras = new char[nElements];
		System.out.println("Digite los elementos del arreglo: ");
		for(int i=0; i<nElements; i++) {
			System.out.println((i+1)+". Digite un caracter: ");
			/*El arreglo se llama letras en una poscion diferente por ello coloqur i dentro de los[]*/
			letras[i] = entrada.next().charAt(0);
			/*charAt(indice) es una funcion de String 
			 * que devuelve el caracter ubicado en la posicion 
			 * indice de la cadena*/	
		}
		
		odd= nElements/2;
		
		//Imprimir todas la letras que se agregaron
		System.out.println("\n Los caracteres del arreglo son: ");
		for(int i=0; i<nElements; i++) {
			System.out.print(letras[i]+" ");
		}
		
	}

}
