package sn.objis.gestOuvrier.domaine;

/**
 * @author Zicrou
 *
 */
public class Metier_by_domaine {

	private int idMetier;
	private int idDomaine;
	private String metier;
	/**
	 * 
	 */
	public Metier_by_domaine() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param idDomaine
	 * @param metier
	 */
	public Metier_by_domaine(int idDomaine, String metier) {
		this.idMetier = idMetier;
		this.idDomaine = idDomaine;
		this.metier = metier;
	}
	
	/**
	 * @param idMetier
	 * @param idDomaine
	 * @param metier
	 */
	public Metier_by_domaine(int idMetier, int idDomaine, String metier) {
		this.idMetier = idMetier;
		this.idDomaine = idDomaine;
		this.metier = metier;
	}
	/**
	 * @return the idMetier
	 */
	public int getIdMetier() {
		return idMetier;
	}
	/**
	 * @param idMetier the idMetier to set
	 */
	public void setIdMetier(int idMetier) {
		this.idMetier = idMetier;
	}
	/**
	 * @return the idDomaine
	 */
	public int getIdDomaine() {
		return idDomaine;
	}
	/**
	 * @param idDomaine the idDomaine to set
	 */
	public void setIdDomaine(int idDomaine) {
		this.idDomaine = idDomaine;
	}
	/**
	 * @return the metier
	 */
	public String getMetier() {
		return metier;
	}
	/**
	 * @param metier the metier to set
	 */
	public void setMetier(String metier) {
		this.metier = metier;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Metier_by_domaine idMetier=" + idMetier + ",\nidDomaine=" + idDomaine + ",\nmetier=" + metier + " \n*******";
	}
	
	
	
	
}
