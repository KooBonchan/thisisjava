package ch06.sec07.exam03;

public class Korean {
  String nation = "ROK";
  String name;
  String ssn;

  public Korean(String name, String ssn){
    this.name = name;
    this.ssn = ssn;
  }

  public Korean(String name){
    this.name = name;
  } // distinguish by type signature
}
