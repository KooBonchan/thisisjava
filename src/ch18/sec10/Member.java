package ch18.sec10;

import java.io.Serial;
import java.io.Serializable;


public class Member implements Serializable {
  @Serial
  private static final long serialVersionUID = 177166438852L;
  private String id;
  private String name;

  public Member(String id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return id + ":" + name;
  }
}
