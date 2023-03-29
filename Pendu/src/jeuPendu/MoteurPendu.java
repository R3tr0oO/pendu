package jeuPendu;

import java.util.Random;

public class MoteurPendu {
	
	//Herqu� Maxime
	//Th�o Portelli
	
	//attributs
	
	private String[] mot_mystere = {"ancre","hypocrisie","interminable","rubis","fil","violon","accueil","explosion","reliure","niais","petit","piquet","blond","punk"};
	private char[] lettre_mot;
	private char[] mot_cache;
	private int erreurs_restantes = 10;
	
	//m�thodes
	
	//obtention d'un mot myst�re, en cherchant al�atoirement dans le tableau de mots disponibles
	public void setMotMystere() {
		Random indice_aleatoire = new Random();
		String mot_str = new String();
		int aleatoire_int = indice_aleatoire.nextInt(this.mot_mystere.length);
		mot_str = mot_mystere[aleatoire_int];
		this.lettre_mot = new char[mot_str.length()];
		//on cr�e une table compos�e des lettres du mot mystere
		for(int j = 0; j<mot_str.length(); j++) {
			lettre_mot[j] = mot_str.charAt(j);
		}
		this.mot_cache=new char[this.lettre_mot.length];
		//on cr�e un mot cach� avec les symboles -
		for(int i=0; i<this.mot_cache.length; i++) {
			this.mot_cache[i] = '-';
		}
	}
	 
	//permet d'utiliser la lettre saisie par l'utilisateur
	public String getLettreMot() {
		String lettre_mot_str = new String(this.lettre_mot);
		return lettre_mot_str;
	}
	
	//permet d'utiliser le mot cach� par des - 
		public String getMotCache() {
			String mot_cache_str = new String(this.mot_cache);
			return mot_cache_str;
		}
	
	// v�rification de la validit� de la lettre saisie par l'utilisateur
	public void setLettreCherchee(char lettre_saisie_char) {
		int absence_lettre = 0;
		// on teste la validit� pour chaques lettres du mot 
		for(int i = 0; i<this.lettre_mot.length; i++) {
			String verification = Character.toString(this.lettre_mot[i]);
			String lettreSaisie_str = Character.toString(lettre_saisie_char);
			//condition vraie, donc on remplace un - par la lettre saisie
			if(verification.equals(lettreSaisie_str)) {
				this.mot_cache[i] = lettre_saisie_char;
			}
			//condition fausse, on passe a la lettre suivante
			if(!verification.equals(lettreSaisie_str)) {
				absence_lettre++;
			} 
		}
		//si aucune lettre n'est juste, le nombre d'erreur est incr�ment�
		if(absence_lettre == this.lettre_mot.length) {
			this.erreurs_restantes--;
		}
	}
	
	//permet de d�finir un nombre d'erreur limit�s
	public int getErreursRestantes() {
		return this.erreurs_restantes;
	}
}
