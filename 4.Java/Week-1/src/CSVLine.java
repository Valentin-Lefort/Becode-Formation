class CSVLine {
  private String FirstName;
  private String LastName;
  private String Path;
  

  
  public CSVLine(String FirstName, String LastName, String Path){
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Path = Path;
  }
  public String getFirstName(){
    return FirstName;
  }
  public String getLastName(){
    return LastName;
  }
  public String getPath(){
    return Path;
  }
  public void setFirstName(){
    this.FirstName = FirstName;
  }
  public void setLastName(){
    this.LastName = LastName;
  }
  public void setPath(){
    this.Path = Path;
  }
}