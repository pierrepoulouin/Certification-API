package co.simplon.esportdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.esportdata.model.Joueur;


public interface PersonneRepository extends JpaRepository<Joueur, Long>  {

}
