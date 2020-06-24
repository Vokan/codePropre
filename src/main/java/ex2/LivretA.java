package ex2;

public class LivretA extends CompteBancaire {

	private double tauxRemuneration;
	
	
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, tauxRemuneration);
		this.tauxRemuneration = tauxRemuneration;
		super.setType("LA");
		}
	
	/**
	 * méthode qui permet de débiter un montant
	 * sur le liveret A
	 */
	@Override
	public void debiterMontant(double montant){
		if (super.getSolde()-montant>0)
		super.setSolde(getSolde()-montant);
		}
	/** méthode qui calcule
	 * rémunération annuel en fonction
	 * du solde sur le livret A
	 */
	public void appliquerRemuAnnuelle(){
		super.setSolde(getSolde()+getSolde()*tauxRemuneration / 100);
	}
	/** Getter
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	}
