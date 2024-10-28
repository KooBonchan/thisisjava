package Static;

import lombok.Getter;

@Getter
public class NoStaticPerson {
  private String name;
  private int population;

  public NoStaticPerson(String name) {
    this.name = name;
    population++;
  }
}
