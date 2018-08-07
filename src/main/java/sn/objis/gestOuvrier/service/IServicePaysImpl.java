/**
 * 
 */
package sn.objis.gestOuvrier.service;

import java.util.List;

import sn.objis.gestOuvrier.dao.IDaoPaysImpl;
import sn.objis.gestOuvrier.domaine.Pays;

/**
 * @author Zicrou
 *
 */
public class IServicePaysImpl implements IServicePays{

	IDaoPaysImpl dao = new IDaoPaysImpl();
	@Override
	public void ajouter(Pays z) {
		// TODO Auto-generated method stub
		dao.create(z);
	}

	@Override
	public List<Pays> lire() {
		// TODO Auto-generated method stub
		return dao.read();
	}

	@Override
	public void modifier(Pays z) {
		// TODO Auto-generated method stub
		dao.update(z);
	}

	@Override
	public void supprimer(Pays z) {
		// TODO Auto-generated method stub
		dao.delete(z);
	}

	@Override
	public List<Pays> lireUn(int id) {
		// TODO Auto-generated method stub
		return dao.readOne(id);
	}

}
