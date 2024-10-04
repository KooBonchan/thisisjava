package ch03.sec07;

public class BitLogic {
  public static void main(String[] args) {
    int a = 45, b = 25;
    System.out.println("Hexadecimal");
    System.out.printf("%d : %8s\n", a, Integer.toBinaryString(a));
    System.out.printf("%d : %8s\n", b, Integer.toBinaryString(b));
    System.out.printf("%X & %X = %X\n", a, b, (a&b));
    System.out.printf("%X | %X = %X\n", a, b, (a|b));
    System.out.printf("%X ^ %X = %X\n", a, b, (a^b));
    System.out.printf("~%X = %X\n", a, (~a));
//    System.out.printf("!%X = %X\n", a, (!a));

    byte sample = -120;
    //extend, without sign bit
    int sampleToInt1 = sample & 0xFF;
    // oxFF integer, higher bits to 0
    int sampleToInt2 = Byte.toUnsignedInt(sample);
    // semantically better?

    System.out.printf("%d %d %d %d", sample, sampleToInt1, sampleToInt2, (int)sample);


  }
}
