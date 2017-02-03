package projetesaip.metier.candidature.communication;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import projetesaip.metier.destination.service.DestinationService;
//import projetesaip.metier.candidature.dto.PizzaDto;
import projetesaip.metier.candidature.service.CandidatureService;
//import projetesaip.metier.candidature.service.Panier;

@Controller
@RequestMapping("/candidature")
public class CandidatureController {
  final CandidatureService candidatureService;
  final DestinationService carteService;
  //final Panier panier;

  @Autowired
  public CandidatureController(CandidatureService candidatureService, DestinationService destinationService/*,
      Panier panier*/) {
    this.candidatureService = candidatureService;
    this.destinationService = destinationService;
    //this.panier = panier;
  }

  @RequestMapping(method = RequestMethod.GET)
  public String candidature(Map<String, Object> model) {
    Map<String/*, Integer> panierAsMap = panier.asMap()*/;
    //model.put("panier", panierAsMap);
    return "commande/confirm";
  }

//  @RequestMapping(method = RequestMethod.POST)
//  public String ajouterPizza(@RequestParam Map<String, String> form, Map<String, Object> model) throws Exception {
//    panier.addPizza(form.get("code"));
//    model.put("pizzas", carteService.getPizzas());
//    return "carte/pizzas";
//  }

  @RequestMapping(method = RequestMethod.POST)
  public String ajouterPizza(@Valid PizzaDto pizzaDto, Map<String, Object> model) {
    panier.addPizza(pizzaDto.getCode());
    model.put("pizzas", carteService.getPizzas());
    return "carte/pizzas";
  }

  @RequestMapping(value = "/confirmer", method = RequestMethod.POST)
  public String confirmerCommande(Map<String, Object> model) {
    commandeService.valider(panier);
    return "redirect:merci";
  }

  @RequestMapping(value = "/merci")
  public String merci(Map<String, Object> model) {
    return "commande/merci";
  }

}
