package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  private final List <Vizitka> seznamVizitek = List.of(
          new Vizitka("Godrik Nebelvír", "Nebelvír", "Věžní 1", "Gryffindor 12345", "GN@lev.com","www.skorobezhlavynick.com","123456789"),
          new Vizitka("Rowena Havraspárská", "Havraspár", "Věžní 2", "Ravenclaw 23456", null,"www.sedadama.com","987654321"),
          new Vizitka("Helga Mrzimorská", "Mrzimor", "Přízemní 8", "Hufflepuff 34567", "HM@jezevec.com","www.tlustymnich.com","321654987"),
          new Vizitka("Salazar Zmijozel", "Zmijozel", "Sklepní 666", "Slytherin 45678", "SZ@had.com","www.krvavybaron.com",null)
  );

  //eit

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("/seznam");
    modelAndView.addObject("vizitky",seznamVizitek);
    return modelAndView;
  }


  @GetMapping("/detail/{id}")

  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("/detail");
    modelAndView.addObject("vizitka", seznamVizitek.get(id));
    return modelAndView;
  }
}