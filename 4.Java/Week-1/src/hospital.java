class hospital {
  private String Date;
  private String Visitor;
  private String Doctor;
  private String Patient;
  
  public hospital(String Date, String Visitor, String Doctor, String Patient){
    this.Date = Date;
    this.Doctor = Doctor;
    this.Visitor = Visitor;
    this.Patient = Patient;
  }
  public String getDate(){
    return Date;
  }
  public String getDoctor(){
    return Doctor;
  }
  public String getVisitor(){
    return Visitor;
  }
  public String getPatient(){
    return Patient;
  }
  public void setDate(){
    this.Date = Date;
  }
  public void setVisitor(){
    this.Visitor = Visitor;
  }
  public void setPath(){
    this.Doctor = Doctor;
  }
  public void setPatient(){
    this.Patient = Patient;
  }
}