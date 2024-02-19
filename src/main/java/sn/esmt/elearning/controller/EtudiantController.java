package sn.esmt.elearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("etudiants")

public class EtudiantController {
  @GetMapping
  public List <String> getAll(){
    return List.of("Tekiyath AMOUSSA","Nazir DAOUDA","Aissatou NDAO");
  }
  @GetMapping("/{prenom}")
  public String get(@PathVariable String prenom ){
    return prenom + "AMOUSSA";
  }
  @PostMapping
  public String save(@RequestBody String personne){
    return personne;
  }
  @PutMapping
  public String update(@RequestBody String personne){
    return personne;
  }
}
