/**
 * 
 */
package fr.persistance;

import java.util.List;

import fr.model.Conseiller;
import fr.model.User;

/**
 * @author Rudolph Nativel
 *
 */
public interface IConseilerDAO {

	List<Conseiller> findAllConseiller();
	
	Conseiller authentification(String login , String password);
}
