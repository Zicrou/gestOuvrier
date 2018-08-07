/**
 * 
 */
package sn.objis.gestOuvrier.domaine;

/**
 * @author Zicrou
 *
 */
public class Ouvriers {

	private int idOuvrier;
	private int idDomaine;
	private int idMetier;
	private int idDepartement;
	private String nomOuvrier;
	private String prenomOuvrier;
	private int telephone;
	private String email;
	private int experience;
	/**
	 * 
	 */
	public Ouvriers() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idOuvrier
	 * @param idDomaine
	 * @param idMetier
	 * @param idDepartement
	 * @param nomOuvrier
	 * @param prenomOuvrier
	 * @param telephone
	 * @param email
	 * @param experience
	 */
	public Ouvriers(int idOuvrier, int idDomaine, int idMetier, int idDepartement, String nomOuvrier,
			String prenomOuvrier, int telephone, String email, int experience) {
		this.idOuvrier = idOuvrier;
		this.idDomaine = idDomaine;
		this.idMetier = idMetier;
		this.idDepartement = idDepartement;
		this.nomOuvrier = nomOuvrier;
		this.prenomOuvrier = prenomOuvrier;
		this.telephone = telephone;
		this.email = email;
		this.experience = experience;
	}
	/**
	 * @return the idOuvrier
	 */
	public int getIdOuvrier() {
		return idOuvrier;
	}
	/**
	 * @return the idDomaine
	 */
	public int getIdDomaine() {
		return idDomaine;
	}
	/**
	 * @return the idMetier
	 */
	public int getIdMetier() {
		return idMetier;
	}
	/**
	 * @return the idDepartement
	 */
	public int getIdDepartement() {
		return idDepartement;
	}
	/**
	 * @return the nomOuvrier
	 */
	public String getNomOuvrier() {
		return nomOuvrier;
	}
	/**
	 * @return the prenomOuvrier
	 */
	public String getPrenomOuvrier() {
		return prenomOuvrier;
	}
	/**
	 * @return the telephone
	 */
	public int getTelephone() {
		return telephone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @param idOuvrier the idOuvrier to set
	 */
	public void setIdOuvrier(int idOuvrier) {
		this.idOuvrier = idOuvrier;
	}
	/**
	 * @param idDomaine the idDomaine to set
	 */
	public void setIdDomaine(int idDomaine) {
		this.idDomaine = idDomaine;
	}
	/**
	 * @param idMetier the idMetier to set
	 */
	public void setIdMetier(int idMetier) {
		this.idMetier = idMetier;
	}
	/**
	 * @param idDepartement the idDepartement to set
	 */
	public void setIdDepartement(int idDepartement) {
		this.idDepartement = idDepartement;
	}
	/**
	 * @param nomOuvrier the nomOuvrier to set
	 */
	public void setNomOuvrier(String nomOuvrier) {
		this.nomOuvrier = nomOuvrier;
	}
	/**
	 * @param prenomOuvrier the prenomOuvrier to set
	 */
	public void setPrenomOuvrier(String prenomOuvrier) {
		this.prenomOuvrier = prenomOuvrier;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ouvriers [idOuvrier=" + idOuvrier + ", idDomaine=" + idDomaine + ", idMetier=" + idMetier
				+ ", idDepartement=" + idDepartement + ", nomOuvrier=" + nomOuvrier + ", prenomOuvrier=" + prenomOuvrier
				+ ", telephone=" + telephone + ", email=" + email + ", experience=" + experience + "]";
	}
	
}
