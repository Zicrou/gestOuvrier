/**
 * 
 */
package sn.objis.gestOuvrier.service;

import java.util.List;

import sn.objis.gestOuvrier.dao.IDaoOuvrierImpl;
import sn.objis.gestOuvrier.domaine.Ouvriers;

/**
 * @author Zicrou
 *
 */
public class IServiceOuvrierImpl implements IServiceOuvrier{

	IDaoOuvrierImpl dao = new IDaoOuvrierImpl();
	@Override
	public void ajouter(Ouvriers z) {
		// TODO Auto-generated method stub
		dao.create(z);
	}

	@Override
	public List<Ouvriers> lire() {
		// TODO Auto-generated method stub
		return dao.read();
	}

	@Override
	public void modifier(Ouvriers z) {
		// TODO Auto-generated method stub
		dao.update(z);
	}

	@Override
	public void supprimer(Ouvriers z) {
	// TODO Auto-generated method stub
		dao.delete(z);
	}

	@Override
	public List<Ouvriers> lireUn(int id) {
		// TODO Auto-generated method stub
		return dao.readOne(id);
	}

}
