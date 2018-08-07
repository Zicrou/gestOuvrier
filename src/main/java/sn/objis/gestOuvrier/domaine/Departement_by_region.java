package sn.objis.gestOuvrier.domaine;

/**
 * @author Zicrou
 *
 */
public class Departement_by_region {

	private int id_departement;
	private int id_region;
	private String departement;
	/**
	 * 
	 */
	public Departement_by_region() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id_departement
	 * @param id_region
	 * @param departement
	 */
	public Departement_by_region(int id_departement, int id_region, String departement) {
		this.id_departement = id_departement;
		this.id_region = id_region;
		this.departement = departement;
	}
	/**
	 * @return the id_departement
	 */
	public int getId_departement() {
		return id_departement;
	}
	/**
	 * @return the id_region
	 */
	public int getId_region() {
		return id_region;
	}
	/**
	 * @return the departement
	 */
	public String getDepartement() {
		return departement;
	}
	/**
	 * @param id_departement the id_departement to set
	 */
	public void setId_departement(int id_departement) {
		this.id_departement = id_departement;
	}
	/**
	 * @param id_region the id_region to set
	 */
	public void setId_region(int id_region) {
		this.id_region = id_region;
	}
	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Departement_by_region \nid_departement=" + id_departement + ",\nid_region=" + id_region + ",\ndepartement="
				+ departement;
	}
	
	
}
