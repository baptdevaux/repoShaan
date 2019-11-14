package test;

import java.text.ParseException;

import javax.persistence.EntityManagerFactory;

import createurShaan.Application;
import createurShaan.model.Caste;
import createurShaan.repository.ICasteRepository;

public class DonneesCaste {
	public static void main(String[] args) throws ParseException {

		EntityManagerFactory emf = Application.getInstance().getEmf();
		
		ICasteRepository casteRepository = Application.getInstance().getCasteRepo();
		
		
		
		Caste novateurs = new Caste();
				
		novateurs.setNomCaste("Les Novateurs");
		
		novateurs.setDescription("Cette Caste rassemble tous ceux qui travaillent le cuir, le métal, la pierre, le bois, le verre, le tissu, ainsi que les machinistes et ceux qui peuvent être amenés à utiliser de la technologie humaine. Cette Caste très influente dispose de nombreuses ramifications au sein des sociétés humaines et héossiennes grâce aux nombreux Ateliers de production qu'elle gère et qui constituent autant de points névralgiques de l'économie héossienne.");
		
//		novateurs.setDomaine(technique);
		
//		novateurs.getMetiers().add(batisseur);
//		novateurs.getMetiers().add(charpentier);
//		novateurs.getMetiers().add(couturier);
//		novateurs.getMetiers().add(forgeron);
//		novateurs.getMetiers().add(infotek);
//		novateurs.getMetiers().add(joaillier);
//		novateurs.getMetiers().add(mecaniste);
//		novateurs.getMetiers().add(pilote);
//		novateurs.getMetiers().add(recuperateur);
//		novateurs.getMetiers().add(tanneur);
		
		
		Caste erudits = new Caste();
		
		erudits.setNomCaste("Les Erudits");
		
		erudits.setDescription("C'est l'élite intellectuelle de la population héossienne. Tous les scientifiques, philosophes, littéraires, ingénieurs et juristes y sont représentés. Le Nouvel Ordre et les Grandes Familles se méfient toujours des Érudits, qui ont été les premiers à comprendre la culture technologique humaine.");
		
//		erudits.setDomaine(savoir);
		
//		erudits.getMetiers().add(alchimiste);
//		erudits.getMetiers().add(archiviste);
//		erudits.getMetiers().add(botaniste);
//		erudits.getMetiers().add(esoterisme);
//		erudits.getMetiers().add(geologue);
//		erudits.getMetiers().add(juriste);
//		erudits.getMetiers().add(historien);
//		erudits.getMetiers().add(medecin);
//		erudits.getMetiers().add(percepteur);
//		erudits.getMetiers().add(zoologue);
		
		
		Caste negociants = new Caste();
		
		negociants.setNomCaste("Les Négociants");
		
		negociants.setDescription("La Caste des Négociants accueille tous ceux qui tissent des liens sociaux, que ce soit à but lucratif ou par intérêt politique. Cette Caste constitue la pierre angulaire de l'économie héossienne, mais est surtout un trait d' union avec les civilisations humaines et nécrosiennes. Le Négociant sait toujours tirer profit d'une situation, quelle qu'elle soit. Peu importe son interlocuteur, il sait que chacun dispose d'une faille qu'il suffit d'exploiter pour prendre l'avantage.");
		
//		negociants.setDomaine(social);
		
//		negociants.getMetiers().add(courtisan);
//		negociants.getMetiers().add(cyberien);
//		negociants.getMetiers().add(diplomate);
//		negociants.getMetiers().add(enseignant);
//		negociants.getMetiers().add(informateur);
//		negociants.getMetiers().add(marchand);
//		negociants.getMetiers().add(politicien);
//		negociants.getMetiers().add(prospecteur);
//		negociants.getMetiers().add(tenancier);
//		negociants.getMetiers().add(traducteur);
		
		negociants = casteRepository.save(negociants);
		
		
		Caste artistes = new Caste();
		
		artistes.setNomCaste("Les Artistes");
		
		artistes.setDescription("La Caste des Artistes rassemble tous ceux dont le but est de divertir la population, que ce soit par la musique, la danse, la comédie, la peinture, la gastronomie, la jonglerie ou les acrobaties. Le Nouvel Ordre n'aimait pas les Artistes, réprimant immédiatement toute manifestation publique. Avec la Révolution et la chute du régime humain, les choses ont changé et les Artistes sont aujourd'hui encouragés à créer, à exposer et à s'exprimer pour revaloriser la culture héossienne. Certains courants artistiques engendrent d'ailleurs de véritables effets de modes qui, grâce à Arpège, se diffusent à l'ensemble du continent, offrant aux Artistes une renommée, une notoriété et une popularité parfois plus importante que celle de toutes les autres Castes.");
		
//		artistes.setDomaine(arts);
		
//		artistes.getMetiers().add(bateleur);
//		artistes.getMetiers().add(evocateur);
//		artistes.getMetiers().add(chanteur);
//		artistes.getMetiers().add(comedien);
//		artistes.getMetiers().add(costumier);
//		artistes.getMetiers().add(cuisinier);
//		artistes.getMetiers().add(danseur);
//		artistes.getMetiers().add(ecrivain);
//		artistes.getMetiers().add(musicien);
//		artistes.getMetiers().add(prestidigitateur);
			
		artistes = casteRepository.save(artistes);
		
		
		
		
}
	
}
