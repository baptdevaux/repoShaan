package createurShaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import createurShaan.model.Personnage;

public interface IPersonnageRepository extends JpaRepository<Personnage, Long>{

}
