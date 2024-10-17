package ch08.sec09;

public class Main {
  public static void main(String[] args) {
    InterfaceCImpl impl = new InterfaceCImpl();

    InterfaceA ia = (InterfaceA) impl;
    ia.methodA();
    System.out.println();

    InterfaceB ib = (InterfaceB) impl;
    ib.methodB();
    System.out.println();

    InterfaceC ic = (InterfaceC) impl;
    ic.methodA();
    ic.methodB();
    ic.methodC();

  }
}
