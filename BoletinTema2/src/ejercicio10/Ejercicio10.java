package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Introduzca tres numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1+num2==num3){
			System.out.println("La suma del numero1 y el numero2 es igual al numero3");
		}else if(num1+num3==num2){
			System.out.println("La suma del numero1 y el numero3 es igual al numero2");
		}else {
			System.out.println("La suma del numero2 y el numero3 es igual al numero1");
		}
		
		
		
		
		sc.close();
	}

}
