package sn.objis.gestOuvrier.service;

import java.util.List;

import sn.objis.gestOuvrier.dao.IDaoDepartement_by_regionImpl;
import sn.objis.gestOuvrier.domaine.Departement_by_region;

public class IServiceDepartement_by_regionImpl implements IServiceDepartement_by_region{

	IDaoDepartement_by_regionImpl dao = new IDaoDepartement_by_regionImpl();
	@Override
	public void ajouter(Departement_by_region z) {
		// TODO Auto-generated method stub
		dao.create(z);
	}

	@Override
	public List<Departement_by_region> lire() {
		// TODO Auto-generated method stub
		return dao.read();
	}

	@Override
	public void modifier(Departement_by_region z) {
		// TODO Auto-generated method stub
		dao.update(z);
	}

	@Override
	public void supprimer(Departement_by_region z) {
		// TODO Auto-generated method stub
		dao.delete(z);
	}

	@Override
	public List<Departement_by_region> lireUn(int id) {
		// TODO Auto-generated method stub
		return dao.readOne(id);
	}

}
