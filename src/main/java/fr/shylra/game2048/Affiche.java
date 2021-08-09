package fr.shylra.game2048;

public class Affiche {
	public static void AfficheMap(Grille grille){
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(grille.map[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
