package ch13.sec03.exam02;

public class GenericInterface {
  static interface Drawable {
    default void draw(){
      System.out.println("Drawing");
    }
  }

  static class Circle implements Drawable {
    @Override
    public void draw() {
      System.out.println("Drawing a circle");
    }
  }

  static class Square implements Drawable {
    @Override
    public void draw() {
      System.out.println("Drawing a square");
    }
  }

  static class Shape {
    private Drawable drawable;

    public Shape(Drawable drawable) {
      this.drawable = drawable;
    }

    public void render() {
      drawable.draw(); // Calls draw() on the Drawable instance
    }
  }

  public static void main(String[] args) {
    Shape c = new Shape(new Circle());
    c.render();

  }

}
