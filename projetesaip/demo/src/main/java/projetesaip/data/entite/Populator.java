package projetesaip.data.entite;


import projetesaip.data.entite.Destination;
import projetesaip.data.entite.Ville;
import projetesaip.data.entite.Type;
import projetesaip.data.entite.Pays;
import projetesaip.data.entite.Quantite;
import projetesaip.data.entite.NbePlaces;

public class Populator {
  Pays createFinlande() {
    Ville seinajoki = new Ville();
    seinajoki.setCode("seinajoki");
    finlande.setNom("Seinajoki");
    seinajoki.setLangue("Finnois");
 
    Ville helsinki = new Ville();
    helsinki.setCode("helsinki");
    finlande.setNom("Helsinki");
    helsinki.setLangue("Finnois");

    Pays finlande = new Pays();
    finlande.setCode("finlande");
    finlande.setNom("Finlande");
    finlande.getVille().add(seinajoki);
    finlande.getVille().add(helsinki);

    return finlande;
  }

  Pays createEspagne() {
	    Ville salamanque = new Ville();
	    salamanque.setCode("salamanque");
	    espagne.setNom("Salamanque");
	    salamanque.setLangue("Espagnol");
	 
	    Ville barcelone = new Ville();
	    barcelone.setCode("barcelone");
	    espagne.setNom("Barcelone");
	    helsinki.setLangue("Espagnol");

	    Pays espagne = new Pays();
	    espagne.setCode("espagne");
	    espagne.setNom("Espagne");
	    espagne.getVille().add(salamanque);
	    espagne.getVille().add(barcelone);

	    return espagne;
	  }

  private NbePlaces createNbePlaces() {
    Quantite seinajoki = new Quantite();
    seinajoki.setCode("seinajoki");
    seinajoki.setValeur(10);

    Quantite helsinki = new Quantite();
    helsinki.setCode("helsinki");
    helsinki.setValeur(5);

    Quantite salamanque = new Quantite();
    salamanque.setCode("salamanque");
    salamanque.setValeur(7);

    Quantite barcelone = new Quantite();
    barcelone.setCode("barcelone");
    barcelone.setValeur(3);


    NbePlaces nbePlaces = new NbePlaces();
    nbePlaces.setNom("Principal");
    nbePlaces.getQuantites().add(seinajoki);
    nbePlaces.getQuantites().add(helsinki);
    nbePlaces.getQuantites().add(salamanque);
    nbePlaces.getQuantites().add(barcelone);

    return nbePlaces;
  }

  public Choix createChoix() {
    // Pays

    Pays finlande = createFinlande();
    Pizza espagne = createEspagne();

    Selection selection = new Selection();
    selection.setNom("Erasmus");
    selection.getPays().add(finlande);
    selection.getPays().add(espagne);

    // Stock

    NbePlaces nbePlaces = createNbePlaces();

    // Pays

    Choix type = new Choix();
    type.setNom("Type")
    type.setDescription("Le choix effectué est le suivant");

    type.setSelection(selection);
    type.setNbePlaces(nbePlaces);

    return type;
  }
}