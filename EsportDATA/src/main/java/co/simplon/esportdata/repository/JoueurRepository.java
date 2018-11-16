package co.simplon.esportdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.esportdata.model.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Integer> {

}
