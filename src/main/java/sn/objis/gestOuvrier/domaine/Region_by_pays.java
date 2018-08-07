/**
 * 
 */
package sn.objis.gestOuvrier.domaine;

/**
 * @author Zicrou
 *
 */
public class Region_by_pays {

	private int id_region;
	private int id_pays;
	private String region;
	/**
	 * 
	 */
	public Region_by_pays() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id_region
	 * @param id_pays
	 * @param region
	 */
	public Region_by_pays(int id_region, int id_pays, String region) {
		this.id_region = id_region;
		this.id_pays = id_pays;
		this.region = region;
	}
	/**
	 * @return the id_region
	 */
	public int getId_region() {
		return id_region;
	}
	/**
	 * @return the id_pays
	 */
	public int getId_pays() {
		return id_pays;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param id_region the id_region to set
	 */
	public void setId_region(int id_region) {
		this.id_region = id_region;
	}
	/**
	 * @param id_pays the id_pays to set
	 */
	public void setId_pays(int id_pays) {
		this.id_pays = id_pays;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Region_by_pays \n id_region=" + id_region + ",\nid_pays=" + id_pays + ",\nregion=" + region;
	}
	
	
}
