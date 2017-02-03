package projetesaip.metier.destination.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import projetesaip.data.acces.TypeDao;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class DestinationService {
  final TypeDao typeDao;

  @Autowired
  public DestinationService(TypeDao typeDao) {
    this.typeDao = typeDao;
  }

  public List<Pays> getPays() {
    List<Pays> pays = typeDao.findByNom("type").getDestination().getPays();
    // Avoid lazy loading exception...
    // Should use ModelMapper for small projects
    if (pays.size() > 0) {
      return pays;
    }
    return Collections.emptyList();
  }
}

