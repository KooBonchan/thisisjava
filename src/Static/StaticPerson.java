package Static;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StaticPerson {
  private String name;
  @Getter
  private static int population;

  public StaticPerson(String name) {
    this.name = name;
    population++;
  }

}
