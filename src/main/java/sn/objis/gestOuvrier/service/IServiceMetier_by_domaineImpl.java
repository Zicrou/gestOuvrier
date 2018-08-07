/**
 * 
 */
package sn.objis.gestOuvrier.service;

import java.util.List;

import sn.objis.gestOuvrier.dao.IDaoDomaineImpl;
import sn.objis.gestOuvrier.dao.IDaoMetier_by_domaineImpl;
import sn.objis.gestOuvrier.domaine.Metier_by_domaine;

/**
 * @author Zicrou
 *
 */
public class IServiceMetier_by_domaineImpl implements IServiceMetier_by_domaine {

	private IDaoMetier_by_domaineImpl dao = new IDaoMetier_by_domaineImpl();
	
	@Override
	public void ajouter(Metier_by_domaine z) {
		// TODO Auto-generated method stub
		dao.create(z);
	}

	@Override
	public List<Metier_by_domaine> lire() {
		// TODO Auto-generated method stub
		return dao.read();
	}

	@Override
	public void modifier(Metier_by_domaine z) {
		// TODO Auto-generated method stub
		dao.update(z);
	}

	@Override
	public void supprimer(Metier_by_domaine z) {
		// TODO Auto-generated method stub
		dao.delete(z);
	}

	@Override
	public List<Metier_by_domaine> lireUn(int id) {
		// TODO Auto-generated method stub
		return dao.readOne(id);
	}

}
