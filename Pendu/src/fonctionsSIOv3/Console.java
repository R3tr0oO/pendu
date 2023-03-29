package fonctionsSIOv3;

import java.io.IOException;

import javax.swing.JOptionPane;


	public class Console
	{

		public static void afficher(String message){
			System.out.println(message);
		}
		
	    /*Cette fonction permet de saisir au clavier une variable de type String*/
	    public static String saisirChaine(String invite)
	    {
			System.out.println(invite);
		    String tmp = "";
		    char C='\0';
			try 
			{
				while ((C=(char) System.in.read()) !='\n')
				{
					if (C != '\r')  tmp = tmp+C;
			 
				}
			}
			catch (IOException e)
			{
				System.out.println("Erreur de frappe");
				System.exit(0);
			}
			return tmp;
	    } 

		/*Cette fonction permet de saisir au clavier une variable entière de type byte*/
		public static byte saisirEntierByte(String invite)  
		{
			byte x=0;
			try 
			{
				x = Byte.parseByte(saisirChaine(invite));
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Format numérique incorrect");
				System.exit(0);
			}	
			return x ;
		}

		/*Cette fonction permet de saisir au clavier une variable entière de type Short*/
		public static short saisirEntierShort(String invite)
		{
			short x=0;
			try 
			{
				x=Short.parseShort(saisirChaine(invite));
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Format numérique incorrect");
				System.exit(0);
			}	
			return x ;
		 }

		/*Cette fonction permet de saisir au clavier une variable entière de type int*/
		public static int saisirEntierInt(String invite)  
		{
			int x=0;
			try 
			{
				x=Integer.parseInt(saisirChaine(invite));
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Format numérique incorrect");
				System.exit(0);
			}	
			return x ;
		 }
		
		/*Cette fonction permet de saisir au clavier une variable entière de type long*/
		public static long saisirEntierLong(String invite) 
		{
			long x=0;
			try 
			{
				x=Integer.parseInt(saisirChaine(invite));
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Format numérique incorrect");
				System.exit(0);
			}	
			return x ;
		 }

		 /*Cette fonction permet de saisir au clavier une variable  réelle  double*/
		public  static double saisirReelDouble(String invite)
		{
			double x=0.0;
			try 
			{
				x=Double.valueOf(saisirChaine(invite)).doubleValue();
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Format numérique incorrect");
				System.exit(0);
			}	
			return x ;
		 }
		 
		/*Cette fonction permet de saisir au clavier une variable  réelle  float*/
		public  static float saisirReelFloat(String invite)
		{
			float x=0.0f;
			try 
			{
				x=Double.valueOf(saisirChaine(invite)).floatValue();
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Format numérique incorrect");
				System.exit(0);
			}	
			return x ;
		}
		
		/*Cette fonction permet de saisir au clavier une variable  de type char*/
		public  static char saisirCaractere(String invite)  
		{
			String tmp=saisirChaine(invite);
			if (tmp.length()==0)
			{
				return '\n';
			}
			else 
			{
				return tmp.charAt(0);
			}
		}
	}