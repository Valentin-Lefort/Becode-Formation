package org.example.challenge4;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Scanner;

@Component
public class RegisterCmd implements Command {
  
  String lastName;
  String firstName;
  String doctor;
  LocalDateTime time;
  ReportCmd report;
  RegisterCmd(ReportCmd report){
    this.report = report;
  }
  
  @Override
  public void run() {
    getInfos();
    VisitOption();
    this.time = LocalDateTime.now();
  }
  private void getInfos(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your last name : ");
    this.lastName = sc.nextLine();
    System.out.println("Enter your first name : ");
    this.firstName = sc.nextLine();
  }
  private void VisitOption(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Are you a doctor or a patient ? : ");
    String answer = sc.nextLine();
    if (answer.equals("doctor") || answer.equals("dr")){
      theDoctor();
      return;
    }
    if (answer.equals("patient")){
      thePatient();
      report.setRegister(this);
    }
    else {
      System.out.println("You have to be a Doctor or a Patient");
      VisitOption();
    }
  }
  private void theDoctor(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name, Doctor : ");
    this.doctor = sc.nextLine();
  }
  private void thePatient(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name, Patient : ");
    this.doctor = sc.nextLine();
  }
}