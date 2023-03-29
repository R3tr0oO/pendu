package jeuPendu;
import fonctionsSIOv3.Fenetre;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Herqu� Maxime
		//Theo Portelli
		
		//d�clarations des variables n�c�ssaires au fonctionnement de l'interface
		String reponse = new String();
		int partie_jouee = 0;
		int partie_gagnee = 0;
		
		//cr�ation d'une boucle, permettant au joueur d'entamer plusieurs parties si il le souhaite
		do {
			MoteurPendu mot_a_trouver = new MoteurPendu(); //
			mot_a_trouver.setMotMystere(); //obtention du mot myst�re
			partie_jouee++;  //compteur de parties jou�es
			do {
				int erreurs = mot_a_trouver.getErreursRestantes(); 
				//saisie d'une lettre
				String lettre_str = Fenetre.saisir("Voici le mot a chercher, "+ mot_a_trouver.getMotCache()+ " Veuillez entrer une lettre. Il reste " + mot_a_trouver.getErreursRestantes()+ " tentatives.", "Affichage");
				//conversion de la lettre saisie en type character
				char lettre_char = lettre_str.charAt(0);
				mot_a_trouver.setLettreCherchee(lettre_char);
				
				//conditions de verifications
				if(erreurs != mot_a_trouver.getErreursRestantes()) { //lettre saisie fausse
					Fenetre.afficher("il n'y a pas de "+ lettre_str+ " dans ce mot", "Affichage");
				}
				
				if(mot_a_trouver.getErreursRestantes() == 0) { //nombre de tentatives nulles
					Fenetre.afficher("Votre n'avez pas trouver le mot, p�rissez !", "Affichage");
				}
				
				if(mot_a_trouver.getMotCache().equals(mot_a_trouver.getLettreMot())){ //mot trouv� completement
					partie_gagnee++;
					Fenetre.afficher("Et c'est gagn� !!! Le mot �tait bien "+ mot_a_trouver.getMotCache()+ ".","Affichage");
				}
				
			} while(mot_a_trouver.getErreursRestantes() > 0 && !mot_a_trouver.getMotCache().equals(mot_a_trouver.getLettreMot())); // condition pour rester dans le jeu
			
			reponse = Fenetre.saisir("Voulez-vous relancer une partie ? oui/non ", "Affichage"); // demande pour relancer le jeu
			
		} while(reponse.equals("oui")); // boucle pour recommencer, si oui a �t� saisie
		
		Fenetre.afficher("Vous avez gagn� "+ partie_gagnee+ " parties sur "+ partie_jouee+ " parties jou�es", "Affichage");
		//affichage des statistiques
	}
}
