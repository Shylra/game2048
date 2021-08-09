package fr.shylra.game2048;

import java.util.Random;

public class Grille {
	int[][] map = new int [4][4];
	
	Grille() {
		int a;
		int b;
		int k = 0;
		Random random = new Random();
		
		a = random.nextInt(16);
		do {
			b = random.nextInt(16);
		} while (a == b);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (k == a || k == b) {
					this.map[i][j] = 2;
				}
				k++;
			}
		}
	}
	
	public boolean IsOver() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (this.map[i][j] == 0) {
					return (false);
				}
			}
		}
		return(true);
	}
	
	public void Next2() {
		int a;
		int i;
		int j;
		boolean done = false;
		Random random = new Random();
		while (!done) {
			a = random.nextInt(16);
			i = a / 4;
			j = a % 4;
			if (this.map[i][j] == 0) {
				this.map[i][j] = 2;
				done = true;
			}
		}
	}
	
	public void bas() {
		for (int k = 0; k < 3; k++) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (this.map[i][j] != 0 && i != 3) {
						if (this.map[i+1][j] == 0) {
							this.map[i+1][j] = this.map[i][j];
							this.map[i][j] = 0;
						}
					}
				}
			}
		}
		//fusion
	}
	
	public void gauche() {
	}
	public void droite() {
	}
	public void haut() {
	}
}
