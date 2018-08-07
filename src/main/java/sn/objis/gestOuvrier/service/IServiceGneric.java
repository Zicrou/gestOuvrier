/**
 * 
 */
package sn.objis.gestOuvrier.service;

import java.util.List;

/**
 * @author Zicrou
 *
 */
public interface IServiceGneric<Z> {

public void ajouter(Z z);
	
	public List<Z> lire();
	
	public List<Z> lireUn(int id);
	
	public void modifier(Z z);
	
	public void supprimer(Z z);
}
