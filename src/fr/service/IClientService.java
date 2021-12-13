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
	 * r�cup�re tout les clients
	 * @return List<CLient>
	 */
	List<Client> findAllByConseiller(int id);	
	
	/**
	 * 
	 * @param client
	 * @return true si �a c'estbien pass�
	 */
	boolean updateClient(User client);
	
	/**
	 * 
	 * @param client
	 * @return user 
	 */
	User createClient(User client);
}
