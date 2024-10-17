package ch08.sec09;

public class InterfaceCImpl implements InterfaceC{
  @Override
  public void methodC() {
    System.out.println("Method C");
  }

  @Override
  public void methodA() {
    System.out.println("Method A");
  }

  @Override
  public void methodB() {
    System.out.println("Method B");
  }
}
