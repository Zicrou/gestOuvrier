package sn.objis.gestOuvrier.domaine;

/**
 * @author Zicrou
 *
 */
public class Pays {

	private int idPays;
	private String pays;
	/**
	 * 
	 */
	public Pays() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idPays
	 * @param pays
	 */
	public Pays(int idPays, String pays) {
		this.idPays = idPays;
		this.pays = pays;
	}
	/**
	 * @return the idPays
	 */
	public int getIdPays() {
		return idPays;
	}
	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}
	/**
	 * @param idPays the idPays to set
	 */
	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}
	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pays \n idPays=" + idPays + ",\n pays=" + pays + "\n*****";
	}
	
	
}
