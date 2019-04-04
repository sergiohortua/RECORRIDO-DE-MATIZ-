package com.sergioh.clase_1;

import java.util.Scanner;

public class MenuDeRecorrido {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("==MENU DE RECORRIDOS==");
			System.out.println("1. RECORRIDO VERTICAL");
			System.out.println("2. RECORRIDO HORIZONTAL");
			System.out.println("3. RECORRIDO EN Z");
			System.out.println("4. RECORRIDO EN N");
			System.out.print("ELIJA UNA OPCION ");
			int opc = tc.nextInt();
			switch (opc) {
			case 1:
				System.out.println();
				System.out.println("RECORRIDO VERTICAL");
				System.out.println();
				System.out.print("Digite el tamaño del arreglo: ");
				int tam = tc.nextInt();
				int arreglo2[][] = new int[tam][tam];

				for (int fil = 0; fil < arreglo2.length; fil++) {
					for (int col = 0; col < arreglo2.length; col++) {
						System.out.print("Digite en la posicion [" + (fil + 1) + "," + (col + 1) + "] de la matriz: ");
						int pos = tc.nextInt();
						arreglo2[fil][col] = pos;
					}

				}
				System.out.println();
				for (int[] is : arreglo2) {
					for (int i : is) {
						System.out.print(i + " ");
					}
					System.out.println();
				}
				System.out.println();

				System.out.println("RECORRIDO VERTICAL: ");

				int col = 0;
				for (int rec = 1; rec < (arreglo2.length + 1); rec++) {
					if (rec % 2 != 0) {
						for (int fil = 0; fil < arreglo2.length; fil++) {
							System.out.print(arreglo2[fil][col] + " ");

						}

					} else if (rec % 2 == 0) {
						for (int fil = (arreglo2.length - 1); fil > -1; fil--) {
							System.out.print(arreglo2[fil][col] + " ");

						}
					}

					col++;
				}

				System.out.println();

				break;
			case 2:
				System.out.println();
				System.out.println("===RECORRIDO HORIZONTAL===");
				System.out.println();
				System.out.print("Digite el tamaño del arreglo: ");
				int tama = tc.nextInt();
				int arreglo1[][] = new int[tama][tama];

				for (int fil = 0; fil < arreglo1.length; fil++) {
					for (int colu = 0; colu < arreglo1.length; colu++) {
						System.out.print("Digite en la posicion [" + (fil + 1) + "," + (colu + 1) + "] de la matriz: ");
						int pos = tc.nextInt();
						arreglo1[fil][colu] = pos;
					}

				}
				System.out.println();
				for (int[] is : arreglo1) {
					for (int i : is) {
						System.out.print(i + " ");
					}
					System.out.println();
				}
				System.out.println();

				System.out.println("RECORRIDO HORIZONTAL: ");

				int fil = 0;
				for (int rec = 1; rec < (arreglo1.length + 1); rec++) {
					if (rec % 2 != 0) {
						for (int colu = 0; colu < arreglo1.length; colu++) {
							System.out.print(arreglo1[fil][colu] + " ");

						}

					} else if (rec % 2 == 0) {
						for (int colu = (arreglo1.length - 1); colu > -1; colu--) {
							System.out.print(arreglo1[fil][colu] + " ");

						}
					}

					fil++;
				}

				System.out.println();

				break;
			case 3:
				System.out.println();
				System.out.println("===RECORRIDO EN Z===");
				System.out.println();
				Scanner tc2 = new Scanner(System.in);
				System.out.print("Digite el tamaño del arreglo: ");
				int tam2 = tc2.nextInt();
				int arreglo4[][] = new int[tam2][tam2];

				for (int fi = 0; fi < arreglo4.length; fi++) {
					for (int co = 0; co < arreglo4.length; co++) {
						System.out.print("Digite en la posicion [" + (fi + 1) + "," + (co + 1) + "] de la matriz: ");
						int pos = tc2.nextInt();
						arreglo4[fi][co] = pos;
					}

				}
				System.out.println();
				for (int[] is : arreglo4) {
					for (int i : is) {
						System.out.print(i + " ");
					}
					System.out.println();
				}

				System.out.println();
				System.out.println("==RECORRIDO DIAGONAL PARA Z==");
				System.out.println();

				for (int fila = 0; fila < arreglo4.length; fila++) {
					for (int colu = 0; colu < arreglo4.length; colu++) {
						if ((fila == fila) && (colu == arreglo4.length - 1 - fila)) {
							System.out.print(arreglo4[fila][colu] + "  ");
						}
					}

				}
				System.out.println();

				break;
			case 4:
				System.out.println();
				System.out.println("===RECORRIDO EN N===");
				System.out.println();
				Scanner tc1 = new Scanner(System.in);
				System.out.print("Digite el tamaño del arreglo: ");
				int tam1 = tc1.nextInt();
				int arreglo3[][] = new int[tam1][tam1];

				for (int fi = 0; fi < arreglo3.length; fi++) {
					for (int co = 0; co < arreglo3.length; co++) {
						System.out.print("Digite en la posicion [" + (fi + 1) + "," + (co + 1) + "] de la matriz: ");
						int pos = tc1.nextInt();
						arreglo3[fi][co] = pos;
					}

				}
				System.out.println();
				for (int[] is : arreglo3) {
					for (int i : is) {
						System.out.print(i + " ");
					}
					System.out.println();
				}

				System.out.println();
				System.out.println("==RECORRIDO DIAGONAL PARA N==");
				System.out.println();

				for (int fi = 0; fi < arreglo3.length; fi++) {
					for (int co = 0; co < arreglo3.length; co++) {
						if (fi == co) {
							System.out.print(arreglo3[fi][co] + "  ");
						}
					}

				}
				System.out.println();
				break;
			default:
				System.out.println("NO ES UNA OPCION VALIDA");

			}

			System.out.println("Desea elegir otro recorrido, 1->SI , 2->NO");
			op = tc.nextInt();
		} while (op == 1);

	}

}
