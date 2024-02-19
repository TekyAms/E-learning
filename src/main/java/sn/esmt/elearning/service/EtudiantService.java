package sn.esmt.elearning.service;

import org.springframework.stereotype.Service;

@Service
public class EtudiantService {
  public boolean checkAge(int age){

    if(age<18)
      return true;
    else
      return false;
    //boolean value= (age<18)?true:false;
    //return value;
  }
}
