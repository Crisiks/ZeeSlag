//Voor inleveren: verander - (boot) in ~ (water), omdat je anders kan zien wat je doet
//Verwijder ongebruikte dingen

package zeeslagje;

import java.util.Scanner;

class ZeeSlagjeProgramma {

	public static void main(String[] args) {
		Boot boot1 = new Boot();
		Water water1 = new Water();
		GezonkenBoot gezonkenboot1 = new GezonkenBoot();

	//	Maakt een zee aan: 0 = water, 1 = boot, 2 = gezonkenboot	
		int[] Zee = new int[10];
		Zee[3] = 1;
		Zee[4] = 1;
		Zee[5] = 1;
		
		printZee (Zee);
//		schieten(Zee);
		
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

	
	public static int schieten (int[] Zee){
		Scanner input = new Scanner(System.in);
		System.out.println("Schiet op positie: ");
		Zee[0] = input.nextInt();
		System.out.println("Je hebt geschoten op: "+ Zee[0]);
		return input.nextInt();
	}
	
}	
	
class Zee{

}

class Water{
	
}

class Boot{
	
}

class GezonkenBoot{
	
}