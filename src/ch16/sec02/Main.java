package ch16.sec02;

public class Main {
  
  static void leeSklar(){
    System.out.println("-------------------------");
    System.out.println("LEELAND SKLAR THE BASSIST");
    System.out.println("Play Bass");
    System.out.println("With long white beard");
    System.out.println("Elegant as a bear");
    System.out.println("Strong as a butterfly");
    System.out.println("-------------------------");
  }
  
  public static void main(String[] args) {
    Person person = new Person();

    person.action(()-> System.out.println("Back Home"));
    
    Button button = new Button();
    button.setClickListener(Main::leeSklar);
    button.click();button.click();
    
  }
}
