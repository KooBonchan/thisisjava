package ch08.sec02;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Object object;
    Random random = new Random();

    if(random.nextBoolean()){
      object = new TV();
    } else{
      object = new Audio();
    }



    // be friendly of instanceof
    if(object instanceof RemoteController){
      ((RemoteController) object).turnOn();;
    }

    if(object instanceof RemoteController){
      ((RemoteController) object).turnOff();;
    }

  }
}
