package test;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import createurShaan.model.Domaine;
import createurShaan.repository.IDomaineRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/application-context.xml")
public class IDomaineRepositoryTestSpring {
	
	@Autowired
	private static IDomaineRepository domaineRepo;
	
	@Test
	public void testDomaine() {
		int startNumber = domaineRepo.findAll().size();
		
		Domaine arts = new Domaine();
		arts.setNom("Arts");
		arts.setElementLie("Autre");
		arts.setDescription("Exprime la firme artistique");
		arts = domaineRepo.save(arts);
		
		Optional<Domaine> artsBis = domaineRepo.findById(arts.getId());
		
		
		Assert.assertEquals("Arts", artsBis.get().getNom());
		
		int endNumber = domaineRepo.findAll().size();
		
		Assert.assertEquals(1, endNumber-startNumber);
		
		domaineRepo.delete(arts);
		artsBis = domaineRepo.findById(arts.getId());
		
		Assert.assertNull(artsBis);
		
	}

}
