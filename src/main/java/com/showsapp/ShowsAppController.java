package com.showsapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowsAppController {
  
  @GetMapping("/")
  public String getShows(Model model) {
    model.addAttribute("first", new Show("Breading Bad", "episode", 10.0));
    model.addAttribute("second", new Show("Attack on Titan", "Hero", 9.9));
    model.addAttribute("third", new Show("Attack on Titan", "Perfect Game", 9.9));
    model.addAttribute("fourth", new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
    model.addAttribute("fifth", new Show("Mr. Robot", "e407 Proxy Authentication Required", 9.9));
    return "shows";
  }
  
  // @GetMapping("/")
  // public ModelAndView getShows() {
  //   Map<String, Show> model = new HashMap<>();
  //   model.put("first", new Show("Breading Bad", "episode", 10.0));
  //   model.put("second", new Show("Attack on Titan", "Hero", 9.9));
  //   model.put("third", new Show("Attack on Titan", "Perfect Game", 9.9));
  //   model.put("fourth", new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
  //   model.put("fifth", new Show("Mr. Robot", "e407 Proxy Authentication Required", 9.9));
  //   return new ModelAndView("shows", model);
  // }
}