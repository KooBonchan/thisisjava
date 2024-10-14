package ch06.sec11.exam02;

public class Earth {
  static final double EARTH_RADIUS = 6400; //km
  static final double EARTH_SURFACE_AREA; //pio men jok

  static{
    EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
  }
}
