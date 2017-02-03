package projetesaip.data.acces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
public interface TypeDao extends JpaRepository<Type, Long> {
  Type findByNom(String nom);
}

