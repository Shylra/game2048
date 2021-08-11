package fr.shylra.game2048;

public class Affiche {
	public static void AfficheMap(Grille grille){
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(grille.map[i][j]);
				if (grille.map[i][j] < 10) {
					System.out.print("     ");
				} else if (grille.map[i][j] < 100) {
					System.out.print("    ");
				} else if (grille.map[i][j] < 1000) {
					System.out.print("   ");
				} else if (grille.map[i][j] < 10000) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
		System.out.println();
	}
}
