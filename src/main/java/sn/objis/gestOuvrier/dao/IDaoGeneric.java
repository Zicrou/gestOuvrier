/**
 * 
 */
package sn.objis.gestOuvrier.dao;

import java.util.List;

/**
 * @author Zicrou
 *
 */
public interface IDaoGeneric<D> {

	/**
	 * 
	 * @param d
	 */
	public void create(D d); 
	
	/**
	 * 
	 * @return
	 */
	public List<D> read();
	
	/**
	 * @return
	 */
	public List<D> readOne(int id);
	
	/**
	 * 
	 * @param d
	 */
	public void update(D d);
	
	/**
	 * 
	 * @param d
	 */
	public void delete(D d);
}
