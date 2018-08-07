package sn.objis.gestOuvrier.service;

import java.util.List;

import sn.objis.gestOuvrier.dao.IDaoDomaineImpl;
import sn.objis.gestOuvrier.domaine.Domaine;

public class IServiceDomaineImpl implements IServiceDomaine{

	private IDaoDomaineImpl dao = new IDaoDomaineImpl();
	
	public void ajouter(Domaine d) {
		// TODO Auto-generated method stub
		dao.create(d);
		
	}

	public List<Domaine> lire() {
		// TODO Auto-generated method stub
		return dao.read();
	}

	public void modifier(Domaine d) {
		// TODO Auto-generated method stub
		dao.update(d);
		
	}

	public void supprimer(Domaine d) {
		// TODO Auto-generated method stub
		dao.delete(d);
		
	}

	@Override
	public List<Domaine> lireUn(int id) {
		// TODO Auto-generated method stub
		return dao.readOne(id);
	}

}
