package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduzca dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1==num2) {
			System.out.println("Los dos numeros introducios son iguales");
		}else {
			System.out.println("Los dos numeros introducios no son iguales");
		}
		
		sc.close();
	}

}
