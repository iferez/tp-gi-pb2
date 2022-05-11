package ar.unlam.edu.pb2;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Integer a; 
		Integer b; 
		Integer opcion; 
		Integer resultado = 0; 

		do{ 
			System.out.println("Ingrese su operación \n 1 para dividir \n 2 para multiplicar \n 3 para sumar \n 4 para restar"); 
			opcion = teclado.nextInt(); 
		} while (opcion < 1 || opcion > 4);
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();

		switch (opcion) {
		case 2:
			 System.out.println("La opcion elegida es la 2");
			resultado = a * b;
			break;
		case 1:
			 System.out.println("La opcion elegida es la 1");
			resultado = a / b;
			break;
		case 3:
			 System.out.println("La opcion elegida es la 3");
			resultado = a + b;
			break;
		case 4:
			 System.out.println("La opcion elegida es la 4");
			resultado = a - b;
			break;
		default:
			 System.out.println( "La opcion no existe" );
			break;
			 
		}
		System.out.println("El resultado es " + resultado.toString());
}
}
