package co.simplon.esportdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.esportdata.model.Utilisateur;

public interface PersonneRepositoryUtilisateur extends JpaRepository<Utilisateur, Long> {

}
