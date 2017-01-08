package org.esaip.projets;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * 
 * @author AuriusTrust
 *
 */
public class ReglePendu {
	
	private Map<Integer, String> disctionnaire;
	private String motATrouver;
	private int nbEssaiEnCours, nbEssaiMax;

	private boolean[] lettreTrouvees;
	private List<String> lettreTestees;
	
	final static Logger logger = Logger.getLogger(ReglePendu.class);
	
	public String getMotATrouver() {
		return motATrouver;
	}
	
	public int getNbEssaiEnCours() {
		return nbEssaiEnCours;
	}
	
	public int getNbEssaiMax() {
		return nbEssaiMax;
	}
	
	public boolean[] getLettreTrouvees() {
		return lettreTrouvees;
	}
	
	public List<String> getLettreTestees() {
		return lettreTestees;
	}
	
	public ReglePendu (Map<Integer, String> dictionnaire) {
		this.disctionnaire = dictionnaire;
		init();
	}
	
	private void init() {
		motATrouver = choisirMot();
		int taille = motATrouver.length();
		lettreTrouvees = new boolean[taille];
		
		for (int i=0; i<taille; i++)
		{
			lettreTrouvees[i]=false;
		}
	}
	
	/**
	 * Choisi un mot dans le dictionnaire
	 * @return le mot
	 */
	private String choisirMot(){
		
		//TODO nombre aléatoire
		int root = 0;
		
		return disctionnaire.get(root);
	}
	
	
	public void play() {
		
	}

}
