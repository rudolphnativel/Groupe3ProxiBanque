/**
 * 
 */
package fr.persistance;

import java.util.List;

import fr.model.Client;
import fr.model.User;

/**
 * @author Rudolph Nativel
 *
 */
public interface IClientDAO {

	/**
	 * récupère tout les clients
	 * @return List<CLient>
	 */
	List<Client> findClientByConseiller(int id);
	
	
	/**
	 * return null si problème
	 * @param User client
	 * @return User
	 */
	User createClient(User client);
}
