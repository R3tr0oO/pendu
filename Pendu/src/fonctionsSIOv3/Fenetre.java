package fonctionsSIOv3;

import javax.swing.JOptionPane;

public class Fenetre {
	public static void afficher(String invite, String titreFenetre){
		JOptionPane.showMessageDialog(null, invite , titreFenetre, JOptionPane.INFORMATION_MESSAGE);
	}
	
	/*Cette fonction permet de saisir au clavier une variable de type String*/
    public static String saisir(String invite,String titreFenetre)
    {
    	String chaine;
		chaine = JOptionPane.showInputDialog(null, invite, titreFenetre, JOptionPane.QUESTION_MESSAGE);
		
		return chaine;
    }
    
}
