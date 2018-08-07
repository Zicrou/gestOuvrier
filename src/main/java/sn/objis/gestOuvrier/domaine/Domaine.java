package sn.objis.gestOuvrier.domaine;

/**
 * @author Zicrou
 *
 */

public class Domaine {
	private int id_domaine;
	private String domaine;
	
	/**
	 * @param id_domaine
	 * @param domaine
	 */
	public Domaine(int id_domaine, String domaine) {
		super();
		this.id_domaine = id_domaine;
		this.domaine = domaine;
	}
	/**
	 * 
	 */
	public Domaine() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param domaine
	 */
	public Domaine(String domaine) {
		this.domaine = domaine;
	}
	
	
	/**
	 * @return the id_domaine
	 */
	public int getId_domaine() {
		return id_domaine;
	}
	/**
	 * @return the domaine
	 */
	public String getDomaine() {
		return domaine;
	}
	/**
	 * @param id_domaine the id_domaine to set
	 */
	public void setId_domaine(int id_domaine) {
		this.id_domaine = id_domaine;
	}
	/**
	 * @param domaine the domaine to set
	 */
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Domaine id_domaine=" + id_domaine + ", \ndomaine=" + domaine + "\n---------------------------";
	}
	
	
}
