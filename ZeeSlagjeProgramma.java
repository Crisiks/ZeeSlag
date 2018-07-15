//Voor echt spel: verander - (boot) in ~ (water), omdat je anders kan zien wat je doet.
//Voor gebruiksvriendelijkheid: verander 0 t/m 2 en 0t/m7 in 1 t/m 3 en 1 t/m 8.

package zeeslagje;

import java.util.Scanner;

class ZeeSlagjeProgramma {

	public static void main(String[] args) {
		System.out.println("Welkom! Het is aan jou drie boten te laten zinken!" + "\n" + "Kies je doelwit zorgvuldig uit door de coördinaten te bepalen." + "\n" + "Kies eerst tussen lijn 1 tot en met 3 en daarna op kolom 1 tot en met 6. Succes!");

	//	Maakt een zee aan: 0 = water, 1 = boot, 2 = gezonkenboot	
		int[][] Zee = new int[3][6];
		Boot boot1 = new Boot();
		Boot boot2 = new Boot();
		Boot boot3 = new Boot();
		Zee[0][1] = boot1.boot;
		Zee[0][0] = boot1.boot;
		Zee[1][5] = boot2.boot;
		Zee[2][3] = boot3.boot;
		
		int[] SchotOpRij = new int[3];
		int[] SchotOpKolom = new int[6];
		int i = 0;
		int[] Aantalkeergeraakt = new int [1]; //Waarom moet dit specifiek een array zijn, geen integer?
		Aantalkeergeraakt[0] = 0;
		
		while (Aantalkeergeraakt[0] < 4) {
		
			printZee (Zee);			
			schietOpRij(SchotOpRij);
			schietOpKolom(SchotOpKolom);
			int DoelwitOpRij = SchotOpRij[i];
			int DoelwitOpKolom = SchotOpKolom[i];
			raken(DoelwitOpRij, DoelwitOpKolom, Zee, Aantalkeergeraakt);
			}
		
		if (Aantalkeergeraakt[0] == 3) {
			System.out.println("Je hebt gewonnen!");
		}		
	}
	
	public static void printZee (int[][] Zee) {
		for(int i = 0; i < Zee.length; i++) {
		for(int j = 0; j < Zee[i].length; j++) {
				if(Zee[i][j] == 0) {
					System.out.print("~");
					}	
				if(Zee[i][j] == 1) {
					System.out.print("-");
					}
				if(Zee[i][j] == -1) {
					System.out.print("o");
					}
				if(Zee[i][j] == 2) {
					System.out.print("x");
					}
				if(j == 5) {
					System.out.println(" ");
				}
			}	
		}
		System.out.println(" ");
	}
	
	public static int schietOpRij (int[] SchotOpRij){
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Schiet op rij: ");
		SchotOpRij[i] = input.nextInt();
//		System.out.println("Je hebt geschoten op: "+ SchotOpRij[i]);
		return SchotOpRij[i];
	}
	
	public static int schietOpKolom (int[] SchotOpKolom){
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Schiet op kolom: ");
		SchotOpKolom[i] = input.nextInt();
//		System.out.println("Je hebt geschoten op: "+ SchotOpKolom[i]);
		return SchotOpKolom[i];
	}

	public static void raken (int DoelwitOpRij, int DoelwitOpKolom, int[][] Zee, int[] Aantalkeergeraakt) {
		if(Zee[DoelwitOpRij][DoelwitOpKolom] == 0) {
			System.out.println("Mis!");
			Zee[DoelwitOpRij][DoelwitOpKolom] = -1;
		}	
		if(Zee[DoelwitOpRij][DoelwitOpKolom] == 1) {
			System.out.println("Raak!");
			Zee[DoelwitOpRij][DoelwitOpKolom] = 2;
			Aantalkeergeraakt[0]++; //Waarom moet dit specifiek een array zijn, geen integer?
			System.out.println("Je hebt al " +Aantalkeergeraakt[0] + " keer iets geraakt!");
			System.out.println(" ");
		}
	}
}	

class Boot{
	int boot = 1;
	String telwoord;
}