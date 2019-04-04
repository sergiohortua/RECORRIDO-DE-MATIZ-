package com.sergioh.clase_1;

import java.util.Scanner;

public class Clase_1_2 {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		System.out.print("Digite el tamaño del arreglo: ");
		int tam = tc.nextInt();
		int arreglo[][] = new int[tam][tam];

		for (int fil = 0; fil < arreglo.length; fil++) {
			for (int col = 0; col < arreglo.length; col++) {
				System.out.print("Digite en la posicion [" + (fil + 1) + "," + (col + 1) + "] de la matriz: ");
				int pos = tc.nextInt();
				arreglo[fil][col] = pos;
			}

		}
		System.out.println();
		for (int[] is : arreglo) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("RECORRIDO VERTICAL: ");

		int col = 0;
		for (int rec = 1; rec < (arreglo.length + 1); rec++) {
			if (rec % 2 != 0) {
				for (int fil = 0; fil < arreglo.length; fil++) {
					System.out.print(arreglo[fil][col] + " ");

				}

			} else if (rec % 2 == 0) {
				for (int fil = (arreglo.length - 1); fil > -1; fil--) {
					System.out.print(arreglo[fil][col] + " ");

				}
			}

			col++;
		}

		System.out.println();

	}

}
