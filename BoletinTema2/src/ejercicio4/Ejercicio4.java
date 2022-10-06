package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduzca dos numeros para ordenarlos de menor a mayor");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1<num2) {
			System.out.println(num1+" < "+num2);
		}else {
			System.out.println(num2+" < "+num1);
		}
		
		sc.close();
	}

}
