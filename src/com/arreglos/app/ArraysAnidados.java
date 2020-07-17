package com.arreglos.app;

public class ArraysAnidados {

	public static void main(String[] args) {
		int[][] grid ={
	 //Columna   1  2  3  4
/*Fila 0*/		{3, 5, 10},
/*Fila 1*/		{2, 4},	
/*Fila 2*/		{1, 2, 3, 4},
/*Fila 3*/		{2, 4, 6}
		
	};
//Ejemplo para indicar manualmente que fila y columna quiero imprimir	
		System.out.println(grid[1][1]);//Fila 1 columna 1
	
	
	String[][] texts = new String[2][3];
	texts[0][1]="Hello there";
	texts[1][2]="jk jg";
	
	
		System.out.println(texts[0][1]);
		
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col<grid[row].length; col++) {
				System.out.println(grid[row][col]+"\t");
			}
		}
	}
	
}