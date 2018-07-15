//Voor inleveren: verander - (boot) in ~ (water), omdat je anders kan zien wat je doet
//Verwijder ongebruikte dingen

package zeeslagje;

import java.util.Scanner;

class ZeeSlagjeProgramma {

	public static void main(String[] args) {

	//	Maakt een zee aan: 0 = water, 1 = boot, 2 = gezonkenboot	
		int[] Zee = new int[5];
		Zee[3] = 1;
		Zee[4] = 1;
		Zee[5] = 1;
		
		int[] Schot = new int[10];
		int i = 0;
		int[] Aantalkeergeraakt = new int [1]; //Waarom moet dit specifiek een array zijn, geen integer?
		Aantalkeergeraakt[0] = 0;
		
		while (Aantalkeergeraakt[0] < 3) {
		
			printZee (Zee);
			schieten(Schot); 
			int Doelwit = Schot[i];
			raken(Doelwit, Zee, Aantalkeergeraakt);
			}
		
		if (Aantalkeergeraakt[0] == 3) {
			System.out.println("Je hebt gewonnen!");
		}
		
		
	}
	
	public static void printZee (int[] Zee) {
		int i = 0;
		for (i = 0; i < Zee.length; i++) {
//		System.out.println("Element at index " + i + " : "+ Zee[i]);
			if(Zee[i] == 0) {
				System.out.print("~");
			}	
			if(Zee[i] == 1) {
				System.out.print("-");
			}
			if(Zee[i] == -1) {
				System.out.print("o");
			}
			if(Zee[i] == 2) {
				System.out.print("x");
			}	
		}
		System.out.println(" ");
	}

	public static int schieten (int[] Schot){
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Schiet op positie: ");
		Schot[i] = input.nextInt();
		System.out.println("Je hebt geschoten op: "+ Schot[i]);
		return Schot[i];
	}
	
	public static void raken (int Doelwit, int[] Zee, int[] Aantalkeergeraakt) {
		if(Zee[Doelwit] == 0) {
			System.out.println("Mis!");
			Zee[Doelwit] = -1;
		}	
		if(Zee[Doelwit] == 1) {
			System.out.println("Raak!");
			Zee[Doelwit] = 2;
			Aantalkeergeraakt[0]++; //Waarom moet dit specifiek een array zijn, geen integer?
			System.out.println("Je hebt al " +Aantalkeergeraakt[0] + " doelwit geraakt!");
		}
	}
	
}	