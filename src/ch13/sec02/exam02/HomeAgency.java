package ch13.sec02.exam02;

import java.util.ArrayList;
import java.util.List;

public class HomeAgency implements Rental<Home>{

  @Override
  public Home rent() {
    return new Home();
  }

}
