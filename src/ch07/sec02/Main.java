package ch07.sec02;

class Main {
  public static void main(String[] args) {
    SmartPhone smartPhone = new SmartPhone("TCU", "Blue");

    System.out.println("Model: " + smartPhone.model);
    System.out.println("Color: " + smartPhone.color);

    System.out.println("Wifi state: " + smartPhone.wifi);

    smartPhone.bell();
    smartPhone.message("Me", "Hi Hello");
    smartPhone.message("You", "No");
    smartPhone.message("Me", "OK Bye");
    smartPhone.hangUp();

    smartPhone.setWifi(true);
    smartPhone.internet();
  }
}
