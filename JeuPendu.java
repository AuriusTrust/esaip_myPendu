package org.esaip.projets;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author AuriusTrust
 *
 */
public class JeuPendu {
	
	private ReglePendu pendu;
	private DessinPendu dessin;
	
	/**
	 * Initialise le dictionnaire à utiliser pour choisir le mot
	 */
	public void init() {
		
		Map<Integer, String> miniDico = new HashMap<>();
		Integer cle = 0;
		miniDico.put(cle++, "dictionnaire");
		miniDico.put(cle++, "esaip");
		miniDico.put(cle++, "projet");
		miniDico.put(cle++, "sushi");
		
		pendu = new ReglePendu(miniDico);
		dessin = new DessinPendu();
	}

	/**
	 * gère les tours jusqu'à la victoire du joueur ou son échec
	 */
	private void play() {
		boolean partieEnCours = true;
		
		while(partieEnCours) {
			
			// TODO gère les tours
		}
	}
	
	public static void main(String[] args) {

		JeuPendu jeu = new JeuPendu();
		jeu.init();
		jeu.play();
	}

}
