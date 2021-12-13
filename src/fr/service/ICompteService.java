/**
 * 
 */
package fr.service;

import java.util.List;

import fr.model.Compte;

/**
 * @author Rudolph Nativel
 *
 */
public interface ICompteService {

	List<Compte> findCompteByUser(int id);
}
