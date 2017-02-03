package projetesaip.data.entite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import projetesaip.data.acces.TypeDao;

@Component
@Transactional
public class PopulatorListener implements ApplicationListener<ContextRefreshedEvent> {

  private final TypeDao dao;
  private final boolean alreadyPopulated = false;

  @Autowired
  public PopulatorListener(TypeDao dao) {
    this.dao = dao;
  }

  public void onApplicationEvent(ContextRefreshedEvent event) {
    /*if (!alreadyPopulated) {
      dao.save(new Populator().createMagasin());
      alreadyPopulated = true;
    }*/
  }
}