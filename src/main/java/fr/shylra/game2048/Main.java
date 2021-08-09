package fr.shylra.game2048;

public class Main {

	public static void main(String[] args) {
		Grille grille = new Grille();
		Affiche.AfficheMap(grille);
		Game.Play(grille);
	}
		

}
