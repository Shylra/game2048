package fr.shylra.game2048;

import java.util.Scanner;

public class Game {
	public static void Play(Grille grille) {
		int mouvement = 5;
		Scanner saisieUtilisateur = new Scanner(System.in);
		while (mouvement != 0) {
			System.out.println("Veuillez saisir un déplacement :\n2 pour bas\n4 pour gauche\n6 pour droite\n8 pour haut\n\nSaisissez 0 pour arréter le jeu");
			try {
				mouvement = saisieUtilisateur.nextInt();
			}
			catch (Exception InputMismatchException) {
				System.out.println("veuillez uniquement saisir 2 4 6 ou 8\n");
				saisieUtilisateur.next();
				continue;
			}
			switch (mouvement) {
				case 0:
					System.out.println("Partie terminée");
					continue;
				case 2:
					grille.bas();
					break;
				case 4:
					grille.gauche();
					break;
				case 6:
					grille.droite();
					break;
				case 8:
					grille.haut();
					break;
				default:
					System.out.println("veuillez uniquement saisir 2 4 6 ou 8\n");
					continue;
			}
			Affiche.AfficheMap(grille);
			if (grille.IsOver()) {
				System.out.println("Game Over !");
				mouvement = 0;
			} else {
				grille.Next2();
				Affiche.AfficheMap(grille);
			}
		}
		saisieUtilisateur.close();
	}
}
