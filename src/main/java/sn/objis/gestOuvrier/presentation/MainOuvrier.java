/**
 * 
 */
package sn.objis.gestOuvrier.presentation;

import java.util.List;
import java.util.stream.Stream;

import sn.objis.gestOuvrier.domaine.Domaine;
import sn.objis.gestOuvrier.domaine.Metier_by_domaine;
import sn.objis.gestOuvrier.service.IServiceDomaine;
import sn.objis.gestOuvrier.service.IServiceDomaineImpl;
import sn.objis.gestOuvrier.service.IServiceMetier_by_domaineImpl;

/**
 * @author Zicrou
 *
 */
public class MainOuvrier {

	public static void main(String[] args) {
		//Creation de l'instance de la couche service
		IServiceMetier_by_domaineImpl service = new IServiceMetier_by_domaineImpl();
		List<Metier_by_domaine> listMetier = service.lire();
		
		Stream<Metier_by_domaine> m = listMetier.stream();
		m.forEach(System.out::println);
		
		/*Metier_by_domaine newMetier = new Metier_by_domaine(1,"JavaLogue");
		service.ajouter(newMetier);
		
		System.out.println("Bravo..!");
		Stream<Metier_by_domaine> m1 = listMetier.stream();
		m1.forEach(System.out::println);*/
		/*IServiceDomaineImpl service = new IServiceDomaineImpl();
		
		List<Domaine> listDomaine = service.lire();
		
		Stream<Domaine> s = listDomaine.stream();
		s.forEach(System.out::println);
		
		Domaine newDomaine = new Domaine("Enseignement Java");
		service.ajouter(newDomaine);
		
		System.out.println("Bravo..!");
		Stream<Domaine> s1 = listDomaine.stream();
		s1.forEach(System.out::println);*/
		
	}
}
