package ex1;

import java.util.Date;

/**
 * @author vokankocak
 * cette class représente les différents éléments 
 * nécessaire à la création d'une entreprise.
 * Elle permet d'instancier des objet de type
 * entreprise
 */
public class entreprise {

	/** numero de Siret*/
	public int Siret;
	/** Nom de l'entrerpise */
	public String Nom;
	/** adresse de l'entreprise*/
	public String adresse;
	/** date_Creation de l'entreprise*/
	public Date date_Creation;
	
	// capital maximume de l'entreprise
	public static final int capitalMax = 3000000;
	
	/**
	 * méthode qui affiche le statue de l'entrerpise
	 */
	public void Afficher_statut(){
		
	}
	
}
