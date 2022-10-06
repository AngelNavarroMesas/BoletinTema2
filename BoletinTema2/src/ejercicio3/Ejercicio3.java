package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.println("Introduzca un numero decimal");
		num = sc.nextDouble();
		
		if(num<0 && num>-1||num>0 && num<1) {
			System.out.println("es numero introducido es casi-cero");
		}else {
			System.out.println("El numero intoducido no es casi-cero");
		}
		
		sc.close();
	}

}
