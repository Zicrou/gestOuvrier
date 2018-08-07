/**
 * 
 */
package sn.objis.gestOuvrier.service;

import java.util.List;

import sn.objis.gestOuvrier.dao.IDaoRegion_by_pays;
import sn.objis.gestOuvrier.dao.IDaoRegion_by_paysImpl;
import sn.objis.gestOuvrier.domaine.Region_by_pays;

/**
 * @author Zicrou
 *
 */
public class IServiceRegion_by_paysImpl implements IServiceRegion_by_pays{

	IDaoRegion_by_paysImpl dao = new IDaoRegion_by_paysImpl();

	@Override
	public void ajouter(Region_by_pays z) {
		// TODO Auto-generated method stub
		dao.create(z);
	}

	@Override
	public List<Region_by_pays> lire() {
		// TODO Auto-generated method stub
		return lire();
	}

	@Override
	public void modifier(Region_by_pays z) {
		// TODO Auto-generated method stub
		dao.update(z);
	}

	@Override
	public void supprimer(Region_by_pays z) {
		// TODO Auto-generated method stub
		dao.delete(z);
	}

	@Override
	public List<Region_by_pays> lireUn(int id) {
		// TODO Auto-generated method stub
		return dao.readOne(id);
	}
	
}
