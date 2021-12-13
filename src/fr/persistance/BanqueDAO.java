/**
 * 
 */
package fr.persistance;
/**
 * @author Rudolph Nativel
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.model.Client;
import fr.model.Conseiller;
import fr.model.User;
import fr.service.BanqueService;


public class BanqueDAO  implements IConseilerDAO, ICompteDAO, IClientDAO{

	private static final Map<Integer, User> DB  = new HashMap<>();
	private static int ID = 1;
	private static BanqueDAO banqueDao = null;
	
	private BanqueDAO() {
		
	}
	
	@Override
	public Conseiller authentification(String login, String password) {
		//créer un conseiller null
		Conseiller conseillerReturn = null;
		List<Conseiller> conseillers = findAllConseiller();
		
		//on boucle sur une liste de conseiller
		for (Conseiller conseiller : conseillers) {
			//si on trouve un conseiller qui à le même login et mmot de passe
			if (conseiller.getLogin().equals(login) && conseiller.getPassword().equals(password)) {
				//on inject cette valeur dans l'objet à retourner
				conseillerReturn =  conseiller;
			}
		}
		return conseillerReturn;
	}

	@Override
	public List<Client> findClientByConseiller(int id) {
		
		return null;
	}

	/**
	 * @return une list de conseillers
	 */
	@Override
	public List<Conseiller> findAllConseiller() {
		//je creer une liste de conseiller
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<User> users = new ArrayList(DB.values());
		List<Conseiller> conseillers = new ArrayList<>() ;
		
		//je parcours ma liste de 'user'
		for (User user : users ) {
			//si un 'user' est une instance de Conseiller
			if(user instanceof Conseiller) {
				//on le l'inject dans la liste créer au départ
				conseillers.add((Conseiller)user);
			}
		}
		return conseillers;
	}
	public static BanqueDAO singletone() {
		
		if (banqueDao == null) {
			banqueDao = new BanqueDAO() ;
		}
		return banqueDao; 
}

	@Override
	public User createClient(User client) {
		client.setIdUser(ID);
		DB.put(ID, client);
		ID++;
		return client;
	}
	
	

	
}
