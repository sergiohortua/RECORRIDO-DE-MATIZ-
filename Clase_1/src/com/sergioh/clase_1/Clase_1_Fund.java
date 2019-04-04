package com.sergioh.clase_1;

import java.util.Scanner;

public class Clase_1_Fund {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tc = new Scanner(System.in);
		
		int opc=0;
		
		do {
		System.out.println("===MENU DE OPERACIONES===");
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. MULTIPLICACION");
		System.out.println("4. DIVISION");
		//int opc= tc.nextInt();
		}while(opc == 1);
		
		
		
		System.out.print("Digite el tamaño del arreglo: ");
		int tam = tc.nextInt();
		int arreglo1[] = new int[tam];
		int arreglo2[] = new int[tam];
		int arreglosuma[] = new int[tam];
		
		System.out.println();
		System.out.println("Llenado del arreglo 1: ");
		for (int i = 0; i < arreglo1.length; i++) {
			System.out.print("Digite un numero en la posicion ["+(i+1)+"] :");
			int pos=tc.nextInt();
			arreglo1[i]=pos;
			
		}
		System.out.println();
		System.out.println("Llenado del arreglo 2: ");
		for (int i = 0; i < arreglo2.length; i++) {
			System.out.print("Digite un numero en la posicion ["+(i+1)+"] :");
			int pos=tc.nextInt();
			arreglo2[i]=pos;
			
		}
		
		for (int i = 0; i < arreglo1.length; i++) {
			arreglosuma[i]=arreglo1[i]+arreglo2[i];
			
		}
		System.out.println();
		System.out.println("La suma de los arreglos es: ");
		for (int i : arreglosuma) {
			System.out.println(i);
		}
		
		
	}

}
/*  Scanner tc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("===MENU DE OPERACIONES===");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISION");
            opc = tc.nextInt();
        } while (opc != 1);

        System.out.print("Digite el tamaño del arreglo: ");
        int tam = tc.nextInt();
        int arreglo1[] = new int[tam];
        int arreglo2[] = new int[tam];
        int arreglosuma[] = new int[tam];

        System.out.println();
        System.out.println("Llenado del arreglo 1: ");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Digite un numero en la posicion [" + (i + 1) + "] :");
            int pos = tc.nextInt();
            arreglo1[i] = pos;

        }
        System.out.println();
        System.out.println("Llenado del arreglo 2: ");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("Digite un numero en la posicion [" + (i + 1) + "] :");
            int pos = tc.nextInt();
            arreglo2[i] = pos;

        }

        for (int i = 0; i < arreglo1.length; i++) {
            arreglosuma[i] = arreglo1[i] + arreglo2[i];

        }
        System.out.println();
        System.out.println("La suma de los arreglos es: ");
        for (int i : arreglosuma) {
            System.out.println(i);
        }
*/
