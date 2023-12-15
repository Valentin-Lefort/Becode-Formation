package org.example.challenge4;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReportCmd implements Command{
  List<RegisterCmd> register = new ArrayList<>();
  
  @Override
  public void run(){
    display();
  }
  public void setRegister(RegisterCmd newRegister){
    System.out.println(register);
    if (register.contains(newRegister)) System.out.println("This visit is already registered");
    else register.add(newRegister);
  }
  public void display(){
    for (RegisterCmd registerCmd : register) {
      System.out.println("Name : " + registerCmd.lastName + " " + registerCmd.firstName);
      System.out.println("Doctor : " + registerCmd.doctor);
      System.out.println("Time : " + registerCmd.time);
    }
  }
}