package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int PIEDRA=1, PAPEL=2, TIJERAS=3, jugador1, jugador2;
		
		System.out.println("Jugador1 elija PIEDRA(1), PAPEL(2) o TIJERAS(3)");
		jugador1 = sc.nextInt();
		System.out.println("Jugador2 elija PIEDRA(1), PAPEL(2) o TIJERAS(3)");
		jugador2 = sc.nextInt();
		
		
		if(jugador1==jugador2) {
			System.out.println("Empate");
		}else if(jugador1==PIEDRA&&jugador2==TIJERAS||
				jugador1==PAPEL&&jugador2==PIEDRA||
				jugador1==TIJERAS&&jugador2==PAPEL) {
			
			System.out.println("Ha ganado el jugador1");
		}else {
			System.out.println("Ha ganado el jugador2");
		}
		
		
		sc.close();
	}

}
