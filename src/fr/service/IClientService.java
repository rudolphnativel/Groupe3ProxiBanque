/**
 * 
 */
package fr.service;

import java.util.List;

import fr.model.Client;
import fr.model.User;

/**
 * @author Rudolph Nativel
 *
 */
public interface IClientService {

	/**
	 * récupère tout les clients
	 * @return List<CLient>
	 */
	List<Client> findAllByConseiller(int id);	
	
	/**
	 * 
	 * @param client
	 * @return true si ça c'estbien passé
	 */
	boolean updateClient(User client);
	
	/**
	 * 
	 * @param client
	 * @return user 
	 */
	User createClient(User client);
}
