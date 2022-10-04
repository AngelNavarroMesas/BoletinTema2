package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Introduzca un numero");
		num1 = sc.nextInt();
		
		num1 %=2;
		
		if (num1==0) {
			System.out.println("El numero introducido es par");
		}else {
			System.out.println("El numero introducido es impar");
		}
		
		sc.close();
	}

}
