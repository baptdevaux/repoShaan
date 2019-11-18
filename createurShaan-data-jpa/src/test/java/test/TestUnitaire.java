package test;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import createurShaan.model.Domaine;
import createurShaan.repository.IDomaineRepository;

@RunWith(SpringRunner.class)
public class TestUnitaire {
	
	
	@Test
	public static void testDomaine() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		IDomaineRepository domaineRepository = context.getBean(IDomaineRepository.class);
		Domaine arts = new Domaine();
		arts.setNom("Arts");
		arts.setElementLie("Autre");
		arts.setDescription("Exprime la firme artistique, la sensualité et la créativité");
		arts = domaineRepository.save(arts);
		
		Optional<Domaine> artsBis = domaineRepository.findById(arts.getId());
		assertEquals(artsBis, arts);
	}

}
