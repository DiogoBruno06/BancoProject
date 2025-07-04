package br.com.banco.project.repository;

import br.com.banco.project.model.AssociadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociadoRepository extends JpaRepository<AssociadoEntity, Long> {

}
