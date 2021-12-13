/**
 * 
 */
package fr.launcher;

import java.util.ArrayList;
import java.util.List;

import fr.model.Adresse;
import fr.model.Client;
import fr.model.Conseiller;
import fr.model.Gerant;
import fr.model.User;
import fr.service.BanqueService;

public class Launch {

	public static void main(String[] args) {
		
		BanqueService banqueService = BanqueService.singletone();
		
		User user1 = new Conseiller( "Dupont", "Herve", new Adresse("56435", "Nantes"), "0676845432", "rgzg", "jtrj");
		User user2 = new Conseiller( "Martin", "Jean", new Adresse("53405", "Paris"), "0674983322", "vevedu38", "judhy");
		User user3 = new Gerant( "Poilu", "Leopoldine", new Adresse("96536", "Lille"), "0676355400", "aezrfd", "ngn");
		
		fakeClient( banqueService );
		user1 = banqueService.createClient(user1);
		banqueService.createClient(user2);
		banqueService.createClient(user3);
		//les conseiller de la banque
		System.out.println("\nLes conseillers de la banque et le gérant");
		banqueService.findAllConseiller().forEach(e->System.out.println(e));
		

	}
	public static void fakeClient(BanqueService banqueService ) {
		for(int i = 0 ; i < 30; i++) {
			User user = new Client( "Terrion"+i, "Maria"+i, new Adresse("5643"+i, "Nantes"), "069687432"+i, "lilili"+i, "azeee"+i);
			User user1 = new Client( "Quezac"+i, "Edouard"+i, new Adresse("3522"+i, "Marseille"), "063226877"+i, "tbsbts"+i, "ertry"+i);
			banqueService.createClient(user);
			banqueService.createClient(user1);
		}
		
	}

}
