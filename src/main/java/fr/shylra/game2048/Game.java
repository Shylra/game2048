package fr.shylra.game2048;

import java.util.Scanner;

public class Game {
	public static void Play(Grille grille) {
		int mouvement = 5;
		boolean change = false;
		Scanner saisieUtilisateur = new Scanner(System.in);
		while (mouvement != 0) {
			System.out.println("Veuillez saisir un déplacement :\n2 pour bas\n4 pour gauche\n6 pour droite\n8 pour haut\n\nSaisissez 0 pour arréter le jeu");
			try {
				mouvement = saisieUtilisateur.nextInt();
			}
			catch (Exception InputMismatchException) {
				System.out.println("veuillez uniquement saisir 2 4 6 ou 8\n");
				Affiche.AfficheMap(grille);
				saisieUtilisateur.next();
				continue;
			}
			switch (mouvement) {
				case 0:
					System.out.println("Partie terminée");
					continue;
				case 2:
					change = grille.bas();
					break;
				case 4:
					change = grille.gauche();
					break;
				case 6:
					change = grille.droite();
					break;
				case 8:
					change = grille.haut();
					break;
				default:
					System.out.println("veuillez uniquement saisir 2 4 6 ou 8\n");
					Affiche.AfficheMap(grille);
					continue;
			}
			Affiche.AfficheMap(grille);
			if (grille.IsOver()) {
				System.out.println("Game Over !");
				mouvement = 0;
			} else if (!change) {
				System.out.println("cette action n'a généré aucun mouvement choisisez une autre action");
				Affiche.AfficheMap(grille);
			} else {
				grille.Next2();
				Affiche.AfficheMap(grille);
			}
		}
		saisieUtilisateur.close();
	}
}
