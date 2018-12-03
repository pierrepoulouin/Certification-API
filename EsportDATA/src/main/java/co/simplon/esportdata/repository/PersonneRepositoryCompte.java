package co.simplon.esportdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.esportdata.model.Compte;

public interface PersonneRepositoryCompte extends JpaRepository<Compte, Long> {

}
