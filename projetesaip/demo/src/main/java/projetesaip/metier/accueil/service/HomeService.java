package projetesaip.metier.accueil.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import projetesaip.data.acces.TypeDao;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class HomeService {
  final TypeDao typeDao;

  @Autowired
  public HomeService(TypeDao typeDao) {
    this.typeDao = typeDao;
  }

  public Type getType() {
    return typeDao.findByNom("type");
  }
}