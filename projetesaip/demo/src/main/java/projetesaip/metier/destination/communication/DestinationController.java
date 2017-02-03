package projetesaip.metier.destination.communication;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import projetesaip.metier.destination.service.DestinationService;

@Controller
public class DestinationController {
  final DestinationService carteService;

  @Autowired
  public DestinationController(DestinationService destinationService) {
    this.destinationService = destinationService;
  }

  @RequestMapping(value = "/pays", method = RequestMethod.GET)
  public String pizzas(Map<String, Object> model) {
    model.put("pays", destinationService.getPays());
    return "destination/pays";
  }
}