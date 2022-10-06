package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un numero entre el 0 y el 99.999");
		num = sc.nextInt();
		
		if(num<10){
			System.out.println("El numero introducido tiene una cifra");
			}else if(num<100){
				System.out.println("El numero introducido tiene dos cifras");
				}else if(num<1000){
					System.out.println("El numero introducido tiene tres cifras");
					}else if(num<10000){
						System.out.println("El numero introducido tiene cuatro cifras");
						}else if(num<100000){
							System.out.println("El numero introducido tiene cinco cifras");
							}else{
								System.out.println("El numero que ha introducido es mayor que 99.999");
								}
		
		sc.close();
	}
}
