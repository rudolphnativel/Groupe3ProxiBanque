/**
 * 
 */
package fr.service;

import java.util.List;

import fr.model.Client;
import fr.model.Compte;
import fr.model.Conseiller;
import fr.model.User;
import fr.persistance.BanqueDAO;

/**
 * @author Rudolph Nativel
 *
 */
public class BanqueService implements IConseiller, IClientService, ICompteService {

	private static BanqueService banqueService = null;
	private  BanqueDAO banqueDao = BanqueDAO.singletone() ;
	
	private BanqueService() {
	}
	
	@Override
	public List<Compte> findCompteByUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAllByConseiller(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateClient(User client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User createClient(User client) {
		if (client != null) {			
			 banqueDao.createClient(client);
			 if(client instanceof Conseiller) {

					System.out.println("Nouvel employer  ==> "+client);
			 }else {

					System.out.println("Nouveau client ==> "+client);
			 }
			return client;
		}
		return client;
	}

	public static BanqueService singletone() {
		
			if (banqueService == null) {
				
				banqueService = new BanqueService() ;
			}
			return banqueService; 
	}
	@Override
	public List<Conseiller> findAllConseiller() {
		
		return banqueDao.findAllConseiller();
	}

}
